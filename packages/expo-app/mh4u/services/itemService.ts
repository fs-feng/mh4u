import axios from "axios";
import { Item } from "@/types/types";

const API_URL = "http:/10.0.2.2:8080";

export const fetchItems = async (): Promise<Item[]> => {
  try {
    const response = await axios.get(API_URL + "/allItems"); // Adjust the endpoint as needed
    const data: Item[] = response.data.map((item: any) => {
      return {
        unique: "Item",
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
      };
    });
    return data;
  } catch (error) {
    console.error("Failed to fetch Items: ", error);
    throw error;
  }
};
