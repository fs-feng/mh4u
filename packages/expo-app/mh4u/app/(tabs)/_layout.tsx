import {Tabs} from "expo-router";
import {Icon} from "@rneui/themed";

const TabsLayout =() => {
    return (
        <Tabs>
            <Tabs.Screen name="index"
                         options={{
                             title: "Home",
                             tabBarIcon: () => (
                                 <Icon name="home" />
                             ),
                             headerStyle: { backgroundColor: 'rgb(153, 153, 255)' }
                         }}

            />
            <Tabs.Screen name="wiki"
                         options={{
                             title: "Wiki",
                             tabBarIcon: () => (
                                 <Icon name="book" />
                             ),
                             headerStyle: { backgroundColor: 'rgb(153, 153, 255)' }
                         }}
            />
        </Tabs>
    );
}

export default TabsLayout;