import {Decoration, ItemToSkillTree} from "../../types/types";
import {FC, useEffect, useState} from "react";
import {fetchItemToSkillTree} from "../../services/itemToSkillTreeService";
import {Link} from "expo-router";
import {Dimensions, Pressable, StyleSheet, View} from "react-native";
import {ListItem, Image, Text, Divider} from "@rneui/themed";

type Props = {
    data: Decoration;
}

const ItemDecoration: FC<Props> = ({ data }) => {
    const { item, num_slots } = data;
    const [itemToSkillTrees, setItemToSkillTrees] = useState<ItemToSkillTree[]>([]);

    //fetch skills associated with the decoration
    useEffect(() => {
        const fetchData = async () => {
            const data = await fetchItemToSkillTree(item.id);
            setItemToSkillTrees(data);
        };

        fetchData();
    }, []);

    return (
        <Link href={"/detail/decoration/" + data.id} asChild>
            <Pressable>
                <ListItem>
                    <Image source={{ uri: "http://10.0.2.2:8000/icons/icons_items/" + item.icon_name }} style={styles.image}/>
                    <View>
                        <Text style={styles.title}>{item.name}</Text>
                        {itemToSkillTrees.map((itemToSkillTree) => (
                            <Text key={itemToSkillTree.id} style={styles.text}>
                                {itemToSkillTree.skill_tree.name}
                                {"  "}
                                {itemToSkillTree.point_value > 0 ? "+" : ""}
                                {itemToSkillTree.point_value}
                            </Text>
                        ))}
                    </View>
                    <View style={styles.slots}>
                        <Text style={styles.title}>
                            {num_slots >= 1 ? "O" : "-"}
                            {num_slots >= 2 ? "O" : "-"}
                            {num_slots >= 3 ? "O" : "-"}
                        </Text>
                    </View>
                </ListItem>
                <Divider/>
            </Pressable>
        </Link>
    );
}


const styles = StyleSheet.create({
    image: {
        width: Dimensions.get("window").height * 0.04, //width of the image
        height: Dimensions.get("window").height * 0.04, //height of the image
    },
    title: {
        fontSize: Dimensions.get("window").height * 0.018, //size of the title
    },
    text: {
        fontSize: Dimensions.get("window").height * 0.01, //size of the text
    },
    slots: {
        flex: 1,
        flexDirection: "row",
        justifyContent: "flex-end",
    }
});

export default ItemDecoration;