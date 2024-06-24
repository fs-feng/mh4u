import {FC} from "react";
import {Link} from "expo-router";
import {Item} from "../../types/types";
import {Dimensions, Pressable, StyleSheet, Text} from "react-native";
import {Image, ListItem} from "@rneui/themed";

type Props = {
    data: Item;
}

const ItemItem: FC<Props> = ({ data }) => {

    return (
        <Link href={"/detail/item/" + data.id} asChild>
            <Pressable>
                <ListItem>
                        <Image source={{ uri: "http://10.0.2.2:8000/icons/icons_items/" + data.icon_name }} style={styles.image}/>
                        <Text style={styles.text}>{ data.name }</Text>
                </ListItem>
            </Pressable>
        </Link>
    );
}

const styles = StyleSheet.create({
    image: {
        width: Dimensions.get("window").height * 0.04,
        height: Dimensions.get("window").height * 0.04,
    },
    text: {
        fontSize: Dimensions.get("window").height * 0.018,
    }
});

export default ItemItem;