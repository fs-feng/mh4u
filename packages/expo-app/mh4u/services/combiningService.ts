import axios from "axios";
import {Combining} from "../types/types";

const API_URL = "http:/10.0.2.2:8080";

export const fetchCombining = async (): Promise<Combining[]> => {
  try {
    const response = await axios.get(API_URL + "/allCombining"); // Adjust the endpoint as needed
    const data: Combining[] = response.data.map((combining: any) => {
      return {
        unique: "Combining",
        id: combining.id,
        created_item: {
          id: combining.createdItem.id,
          name: combining.createdItem.name,
          name_de: combining.createdItem.nameDe,
          name_fr: combining.createdItem.nameFr,
          name_es: combining.createdItem.nameEs,
          name_it: combining.createdItem.nameIt,
          name_jp: combining.createdItem.nameJp,
          type: combining.createdItem.type,
          sub_type: combining.createdItem.subType,
          rarity: combining.createdItem.rarity,
          carry_capacity: combining.createdItem.carryCapacity,
          buy: combining.createdItem.buy,
          sell: combining.createdItem.sell,
          description: combining.createdItem.description,
          icon_name: combining.createdItem.iconName,
          armor_dupe_name_fix: combining.createdItem.armorDupeNameFix,
        },
        item1: {
          id: combining.item1.id,
          name: combining.item1.name,
          name_de: combining.item1.nameDe,
          name_fr: combining.item1.nameFr,
          name_es: combining.item1.nameEs,
          name_it: combining.item1.nameIt,
          name_jp: combining.item1.nameJp,
          type: combining.item1.type,
          sub_type: combining.item1.subType,
          rarity: combining.item1.rarity,
          carry_capacity: combining.item1.carryCapacity,
          buy: combining.item1.buy,
          sell: combining.item1.sell,
          description: combining.item1.description,
          icon_name: combining.item1.iconName,
          armor_dupe_name_fix: combining.item1.armorDupeNameFix,
        },
        item2: {
          id: combining.item2.id,
          name: combining.item2.name,
          name_de: combining.item2.nameDe,
          name_fr: combining.item2.nameFr,
          name_es: combining.item2.nameEs,
          name_it: combining.item2.nameIt,
          name_jp: combining.item2.nameJp,
          type: combining.item2.type,
          sub_type: combining.item2.subType,
          rarity: combining.item2.rarity,
          carry_capacity: combining.item2.carryCapacity,
          buy: combining.item2.buy,
          sell: combining.item1.sell,
          description: combining.item2.description,
          icon_name: combining.item2.iconName,
          armor_dupe_name_fix: combining.item2.armorDupeNameFix,
        },
        amount_made_min: combining.amountMadeMin,
        amount_made_max: combining.amountMadeMax,
        percentage: combining.percentage,
      };
    });
    return data;
  } catch (error) {
    console.error("Failed to fetch Combinings: ", error);
    throw error;
  }
};

export const fetchMatchingCombining = async (id: number): Promise<Combining[]> => {
  try {
    const response = await axios.get(API_URL + "/combiningMatchId/" + id); // Adjust the endpoint as needed
    const data: Combining[] = response.data.map((combining: any) => {
      return {
        unique: "Combining",
        id: combining.id,
        created_item: {
          id: combining.createdItem.id,
          name: combining.createdItem.name,
          name_de: combining.createdItem.nameDe,
          name_fr: combining.createdItem.nameFr,
          name_es: combining.createdItem.nameEs,
          name_it: combining.createdItem.nameIt,
          name_jp: combining.createdItem.nameJp,
          type: combining.createdItem.type,
          sub_type: combining.createdItem.subType,
          rarity: combining.createdItem.rarity,
          carry_capacity: combining.createdItem.carryCapacity,
          buy: combining.createdItem.buy,
          sell: combining.createdItem.sell,
          description: combining.createdItem.description,
          icon_name: combining.createdItem.iconName,
          armor_dupe_name_fix: combining.createdItem.armorDupeNameFix,
        },
        item1: {
          id: combining.item1.id,
          name: combining.item1.name,
          name_de: combining.item1.nameDe,
          name_fr: combining.item1.nameFr,
          name_es: combining.item1.nameEs,
          name_it: combining.item1.nameIt,
          name_jp: combining.item1.nameJp,
          type: combining.item1.type,
          sub_type: combining.item1.subType,
          rarity: combining.item1.rarity,
          carry_capacity: combining.item1.carryCapacity,
          buy: combining.item1.buy,
          sell: combining.item1.sell,
          description: combining.item1.description,
          icon_name: combining.item1.iconName,
          armor_dupe_name_fix: combining.item1.armorDupeNameFix,
        },
        item2: {
          id: combining.item2.id,
          name: combining.item2.name,
          name_de: combining.item2.nameDe,
          name_fr: combining.item2.nameFr,
          name_es: combining.item2.nameEs,
          name_it: combining.item2.nameIt,
          name_jp: combining.item2.nameJp,
          type: combining.item2.type,
          sub_type: combining.item2.subType,
          rarity: combining.item2.rarity,
          carry_capacity: combining.item2.carryCapacity,
          buy: combining.item2.buy,
          sell: combining.item1.sell,
          description: combining.item2.description,
          icon_name: combining.item2.iconName,
          armor_dupe_name_fix: combining.item2.armorDupeNameFix,
        },
        amount_made_min: combining.amountMadeMin,
        amount_made_max: combining.amountMadeMax,
        percentage: combining.percentage,
      };
    });
    return data;
  } catch (error) {
    console.error("Failed to fetch Combinings: ", error);
    throw error;
  }
};
