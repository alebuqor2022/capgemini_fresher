import React from "react";
import { ImageBackground, StyleSheet, Text,TextInput,TouchableOpacity, View } from 'react-native';

export default class  App extends React.Component {
  state ={
    altura: 0,
    masa: 0,
    resultadoNro: 0,
    resultadoText: ""
  };

  calcular =() =>{
    // calculo de la masas corporal metros(altura) y kilos (peso)
    let imc=this.state.masa / this.state.altura **2;
    this.setState({resultadoNro: imc.toFixed(2)});

    if (imc < 18.5){
      this.setState({resultadoText : "estas muy delgado"});
    } else if (imc >= 18.5 && imc <25){
      this.setState({resultadoText : "estas normal"});
    } else if (imc >= 25 && imc <30){
      this.setState({resultadoText : "estas gordo"});
    } else if (imc >=30){
      this.setState({resultadoText : "estas obeso"});
    }
  };

  render () {
    return(
    <ImageBackground 
    source={require("./assets/bg.png")} 
    style={styles.backgroundImage}>
        <View style={styles.container}>
          <Text style={{
          color:"#FFCB1F",
          justifyContent:"center", 
          alignSelf:"center", marginTop:30, fontSize: 38}}>
            CALCULADORA DE MASA CORPORAL</Text>
        <View style={styles.intro}>
          <TextInput 
          placeholder="Altura" 
          keyboardType="numeric"
          onChangeText={altura => {this.setState({altura})}} 
          style={styles.input}
          ></TextInput>
          <TextInput 
          placeholder="Peso" 
          keyboardType="numeric"
          onChangeText={masa => {this.setState({masa})}} 
          style={styles.input}
          ></TextInput>
        </View> 
        <TouchableOpacity onPress={this.calcular} style={styles.button}>
          <Text style={styles.buttonText}>Calcular</Text>
        </TouchableOpacity>

         <Text style={styles.result}>{this.state.resultadoNro}</Text>
         <Text style={[styles.result, {fontSize:35}]}>{this.state.resultadoText}</Text>
        </View>

    </ImageBackground>
     )
    }
}


// los estilos pueden ir en el mismo archivo o en archivo independiente
const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  intro: {
    flexDirection: "row",
  },
  input:{
    height:80,
    textAlign: "center",
    width: "50%",
    fontSize: 50,
    marginTop: 24,
    color: "#FFCB1F"
  }, 
  result: {
    alignSelf: "center",
    color: "#FFCB1F",
    fontSize: 65,
    padding: 15
  },
  button: {
    backgroundColor: "#1D1D1B"
  },
  buttonText: {
    alignSelf: "center",
    padding: 30,
    fontSize: 25,
    color: "#FFCB1F",
    fontWeight: "bold"
  },
  backgroundImage: {
    flex:1,
    width: "100%", 
    height:"100%"
  }

  
});
