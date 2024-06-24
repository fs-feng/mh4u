import axios from "axios";
import {Decoration} from "../types/types";
const API_URL = "http:/10.0.2.2:8080";

export const fetchDecorations = async (): Promise<Decoration[]> => {
  try {
    const response = await axios.get(API_URL + "/allDecorations"); // Adjust the endpoint as needed
    const data: Decoration[] = response.data.map((decoration: any) => {
      return {
        unique: "Decoration",
        id: decoration.id,
        num_slots: decoration.numSlots,
        item: {
          id: decoration.item.id,
          name: decoration.item.name,
          name_de: decoration.item.nameDe,
          name_fr: decoration.item.nameFr,
          name_es: decoration.item.nameEs,
          name_it: decoration.item.nameIt,
          name_jp: decoration.item.nameJp,
          type: decoration.item.type,
          sub_type: decoration.item.subType,
          rarity: decoration.item.rarity,
          carry_capacity: decoration.item.carryCapacity,
          buy: decoration.item.buy,
          sell: decoration.item.sell,
          description: decoration.item.description,
          icon_name: decoration.item.iconName,
          armor_dupe_name_fix: decoration.item.armorDupeNameFix,
        },
      };
    });
    return data;
  } catch (error) {
    console.error("Failed to fetch Decorations: ", error);
    throw error;
  }
};

export const fetchDecorationById = async (id: number): Promise<Decoration> => {
  try {
    const response = await axios.get(`${API_URL}/decorationById/${id}`);
    const decoration = response.data;
    const data: Decoration = {
      unique: "Decoration",
      id: decoration.id,
      num_slots: decoration.numSlots,
      item: {
        unique: "Item",
        id: decoration.item.id,
        name: decoration.item.name,
        name_de: decoration.item.nameDe,
        name_fr: decoration.item.nameFr,
        name_es: decoration.item.nameEs,
        name_it: decoration.item.nameIt,
        name_jp: decoration.item.nameJp,
        type: decoration.item.type,
        sub_type: decoration.item.subType,
        rarity: decoration.item.rarity,
        carry_capacity: decoration.item.carryCapacity,
        buy: decoration.item.buy,
        sell: decoration.item.sell,
        description: decoration.item.description,
        icon_name: decoration.item.iconName,
        armor_dupe_name_fix: decoration.item.armorDupeNameFix,
      },
    };
    return data;
  } catch (error) {
    console.error(`Failed to fetch Decoration with id ${id}: `, error);
    throw error;
  }
};