
// ejemplo del slider
// npm install @react-native-community/slider --save
import { StatusBar } from 'expo-status-bar';
import { Text, View } from 'react-native';
import Slider from '@react-native-community/slider';


export default function App() {
  return (
    <View>
      <Text>Buen dia grupo !!!!</Text>
      <Slider
          style={{width: 200, height: 40}}
          minimumValue={0}
          maximumValue={1}
          minimumTrackTintColor="#FFFFFF"
          maximumTrackTintColor="#000000"
      />
      <StatusBar style="auto" />
    </View>
  );
}

