import React from 'react'
import { View, StyleSheet } from 'react-native'
import TabBarItem from './TabBarItem';

const TabBar = ({setType, type}) => (
<View style={styles.container}>
<TabBarItem 
type={type} 
title='All' 
setType={() => setType('All')}
></TabBarItem>
<TabBarItem
type={type} 
border
title='Active' 
setType={() => setType('Active')}
></TabBarItem>
<TabBarItem 
type={type} 
border
title='Complete' 
setType={() => setType('Complete')}
></TabBarItem>
</View>
)

const styles = StyleSheet.create({
    container: {
      height: 70,
      flexDirection: 'row',
      borderTopWidth: 1,
      borderTopColor: '#dddddd'
    }
}
);

export default TabBar