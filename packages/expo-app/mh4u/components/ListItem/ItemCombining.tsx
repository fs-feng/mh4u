import { Combining} from "../../types/types";
import {FC} from "react";
import {Link} from "expo-router";
import {Dimensions, Pressable, StyleSheet, Text, View} from "react-native";
import {Divider, Image, ListItem} from "@rneui/themed";

type Props = {
    data: Combining;
}

const ItemCombining: FC<Props> = ({ data }) => {
    const { created_item, item1, item2 } = data;

    return (
        <View>
            <ListItem>
                <View style={styles.container}>
                    <Link href={"/detail/item/" + created_item.id} asChild>
                        <Pressable>
                            <View style={styles.containerItem}>
                                <Image source={{ uri: "http://10.0.2.2:8000/icons/icons_items/" + created_item.icon_name }} style={styles.image} />
                                <Text style={styles.text}>{created_item.name}</Text>
                            </View>
                        </Pressable>
                    </Link>

                </View>
                <View style={styles.container}>
                    <Link href={"/detail/item/" + item1.id} asChild>
                        <Pressable>
                            <View style={styles.containerItem}>
                                <Image source={{ uri: "http://10.0.2.2:8000/icons/icons_items/" + item1.icon_name }} style={styles.image}/>
                                <Text style={styles.text}>{ item1.name }</Text>
                            </View>
                        </Pressable>
                    </Link>

                    <Link href={"/detail/item/" + item2.id} asChild>
                        <Pressable>
                            <View style={[{marginTop: 10}, styles.containerItem]}>
                                <Image source={{ uri: "http://10.0.2.2:8000/icons/icons_items/" + item2.icon_name }} style={styles.image}/>
                                <Text style={styles.text}>{ item2.name }</Text>
                            </View>
                        </Pressable>
                    </Link>

                </View>
            </ListItem>
            <Divider/>
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        width: Dimensions.get("window").width * 0.5,
    },
    containerItem: {
        flexDirection: "row",
        justifyContent: "flex-start",
        alignItems: "center",
    },
    image: {
        width: Dimensions.get("window").height * 0.025,
        height:Dimensions.get("window").height * 0.025,
    },
    text: {
        fontSize: Dimensions.get("window").height * 0.015,
    },
});

export default ItemCombining;