// este ejemplo solo funciona en la WEB
// import React from "react";
// import PropTypes from "prop-types";
// import { View, Text, Picker } from "react-native";
// import styles from "./styles";

// export default function Select(props) {
//   return (
//     <View>
//       <Text style={styles.pickerLabel}>{props.label}</Text>
//       <Picker {...props}>
//         {props.items.map(i => (
//           <Picker.Item key={i.label} {...i} />
//         ))}
//       </Picker>
//     </View>
//   );
// }

// Select.propTypes = {
//   items: PropTypes.array,
//   label: PropTypes.string
// };

// este ejemplo  funciona en la WEB  y en ANDROID
//  npm install @react-native-picker/picker    reemplaza al viejo picker que estaba en react-native

import React, { useState } from "react";
import { View, Text, StyleSheet } from "react-native";

import { Picker } from "@react-native-picker/picker";

function App() {
  const [country, setCountry] = useState('Unknown');

  return (
    <View style={styles.screen}>
      <Text style={styles.text}>Vamoooo !!!</Text>
      <Picker
        selectedValue={country}
        onValueChange={(value, index) => setCountry(value)}
        mode="dropdown" // Android only
        style={styles.picker}
      >
        <Picker.Item label="Tu pais" value="Unknown" />
        <Picker.Item label="Australia" value="Australia" />
        <Picker.Item label="España" value="España" />
        <Picker.Item label="Canada" value="Canada" />
        <Picker.Item label="Argentina" value="Argentina" />
        <Picker.Item label="India" value="India" />
        <Picker.Item label="Japan" value="Japan" />
      </Picker>
      <Text style={styles.text}>Tu pais: {country}</Text>
    </View>
  );
}

export default App;

// Just some styles
const styles = StyleSheet.create({
  screen: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
    backgroundColor: 'yellow'
  },
  text: {
    fontSize: 24,
  },
  picker: {
    marginVertical: 30,
    width: 300,
    padding: 10,
    borderWidth: 1,
    borderColor: "#666",
  },
});

// For more React Native tutorials
// Visit https://www.kindacode.com/cat/mobile/react-native/