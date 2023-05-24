import React from "react";
import {
  View,
  Text,
  StyleSheet,
  TouchableHighlight,
  Image,
} from "react-native";
import { FontAwesomeIcon } from "@fortawesome/react-native-fontawesome";

const Button = ({ submit, text, imagen }) => {
  return (
    <View style={styles.buttonContainer}>
      <TouchableHighlight
        onPress={submit}
        style={styles.button}
        underlayColor="#efefef"
      >
        <Icon text={text} imagen={imagen} />
      </TouchableHighlight>
    </View>
  );
};

const Icon = ({ text, imagen }) => {
  return (
    <View style={styles.iconContainer}>
      <FontAwesomeIcon style={styles.submitIcon} icon={imagen} size={30} />
      <Text style={styles.submit}>{text}</Text>
    </View>
  );
};

const styles = StyleSheet.create({
  buttonContainer: {
    alignItems: "baseline",
  },
  button: {
    backgroundColor: "#ffffff",
    borderWidth: 2,
    borderColor: "rgba(0,0,0,.1)",
    justifyContent: "center",
    alignItems: "center",
  },
  submit: {
    color: "#666666",
    fontWeight: "600",
    textAlign: "center",
  },
  submitIcon: {

    textAlign: "center",
    justifyContent:"center"
  },
  iconContainer: {
    justifyContent: "center",
    alignItems: "center",
  },
});

export default Button;
