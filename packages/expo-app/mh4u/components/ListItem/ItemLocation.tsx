import {Location} from "../../types/types";
import {FC} from "react";
import {Link} from "expo-router";
import {Dimensions, Pressable, StyleSheet} from "react-native";
import {Divider, Image, ListItem, Text} from "@rneui/themed";


type Props = {
    data: Location;
};

const ItemLocation: FC<Props> = ({ data }) => {
    const { name, map } = data;

    return (
        <Link href={"/detail/location/" + data.id} asChild>
            <Pressable>
                <ListItem>
                    <Image source={{ uri: "http://10.0.2.2:8000/icons/icons_location/" + map }} style={styles.image}/>
                    <Text style={styles.text}>{name}</Text>
                </ListItem>
                <Divider/>
            </Pressable>
        </Link>
    );
};

const styles = StyleSheet.create({
    image: {
        width: Dimensions.get("window").height * 0.04,
        height: Dimensions.get("window").height * 0.04,
    },
    text: {
        fontSize: Dimensions.get("window").height * 0.018,
    }
});

export default ItemLocation;