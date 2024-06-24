import {View, Text, Pressable} from "react-native";
import { SafeAreaProvider} from "react-native-safe-area-context";
import {Link} from "expo-router";
import {Card, Icon} from "@rneui/themed";
import {Button} from "@rneui/base";

const HomePage = () => {
    return (
        <SafeAreaProvider>
            <View>
                <Card>
                    <Card.Title>Monster Hunter 4 Ultimate</Card.Title>
                    <Card.Divider/>
                    <Card.Image
                        style={{ padding: 0 }}
                        source={{ uri: "http://10.0.2.2:8000/icons/mh4u.png" }}
                    />
                </Card>
            </View>
        </SafeAreaProvider>
    );
}

export default HomePage;