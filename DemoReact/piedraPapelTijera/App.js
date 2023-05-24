import { StatusBar } from "expo-status-bar";
import { Component } from "react";
import { StyleSheet, Text, View } from "react-native";
import Button from "./components/Button";
import { jugadas } from "./utils/jugadas";
import { jugadorMaquina } from "./utils/lagartoSpockAPI";

import {
  faHandBackFist,
  faHand,
  faHandScissors,
  faHandLizard,
  faHandSpock,
} from "@fortawesome/free-solid-svg-icons";

class App extends Component {
  constructor() {
    super();
    this.state = {
      resultado: "Selecciona una mano para jugar!",
    };
  }

  handleSubmit = (jugador1) => {
    const resultado = jugadorMaquina(jugador1);
    this.setState({ resultado });
  };

  render() {
    const { resultado } = this.state;
    return (
      <View style={styles.container}>
        <Text style={styles.titulo}>
          Piedra, papel, tijera, lagarto, spock!
        </Text>
        <StatusBar style="auto" />
        <View style={styles.buttonContainer}>
          <Button
            submit={() => this.handleSubmit(jugadas.PIEDRA)}
            text={jugadas.PIEDRA}
            imagen={faHandBackFist}
          />
          <Button
            submit={() => this.handleSubmit(jugadas.PAPEL)}
            text={jugadas.PAPEL}
            imagen={faHand}
          />
          <Button
            submit={() => this.handleSubmit(jugadas.TIJERA)}
            text={jugadas.TIJERA}
            imagen={faHandScissors}
          />
          <Button
            submit={() => this.handleSubmit(jugadas.LAGARTO)}
            text={jugadas.LAGARTO}
            imagen={faHandLizard}
          />
          <Button
            submit={() => this.handleSubmit(jugadas.SPOCK)}
            text={jugadas.SPOCK}
            imagen={faHandSpock}
          />
        </View>
        <Text style={styles.textResultado}>{resultado}</Text>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff",
    alignItems: "center",
    justifyContent: "center",
  },
  textResultado: {
    textAlign: "center",
    fontSize: 24,
    fontWeight: "bold",
    margin:20
  },
  titulo: {
    fontSize: 32,
    fontWeight: "bold",
    margin:20
  },
  buttonContainer: {
    flexDirection: "row",
    flexWrap: "wrap",
    
  },
});

export default App;
