import axios from "axios";
import { ItemToSkillTree } from "@/types/types";

const API_URL = "http:/10.0.2.2:8080";

export const fetchItemToSkillTree = async (
  itemId: number
): Promise<ItemToSkillTree[]> => {
  try {
    const response = await axios.get(API_URL + "/itemToSkillTree/" + itemId);
    const data: ItemToSkillTree[] = response.data.map(
      (itemToSkillTree: any) => {
        const item = itemToSkillTree.item;
        const skillTree = itemToSkillTree.skillTree;
        return {
          unique: "ItemToSkillTree",
          id: itemToSkillTree.id,
          item: {
            id: item.id,
            name: item.name,
            name_de: item.nameDe,
            name_fr: item.nameFr,
            name_es: item.nameEs,
            name_it: item.nameIt,
            name_jp: item.nameJp,
            type: item.type,
            sub_type: item.subType,
            rarity: item.rarity,
            carry_capacity: item.carryCapacity,
            buy: item.buy,
            sell: item.sell,
            description: item.description,
            icon_name: item.iconName,
            armor_dupe_name_fix: item.armorDupeNameFix,
          },
          skill_tree: {
            id: skillTree.id,
            name: skillTree.name,
            name_de: skillTree.nameDe,
            name_fr: skillTree.nameFr,
            name_es: skillTree.nameEs,
            name_it: skillTree.nameIt,
            name_jp: skillTree.nameJp,
          },
          point_value: itemToSkillTree.pointValue,
        };
      }
    );
    return data;
  } catch (error) {
    console.error("Failed to fetch Skill Tree: ", error);
    throw error;
  }
};
