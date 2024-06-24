import axios from "axios";
import {Location, Monster} from "../types/types";
const API_URL = "http:/10.0.2.2:8080";

export const fetchMonsters = async () => {
  try {
    const response = await axios.get(API_URL + "/allMonsters");
    const data: Monster[] = response.data.map((monster: any) => {
      return {
        unique: "Monster",
        id: monster.id, // _id in db
        monsterClass: monster.monsterClass, // class in db
        name: monster.name,
        name_de: monster.nameDe,
        name_fr: monster.nameFr,
        name_es: monster.nameEs,
        name_it: monster.nameIt,
        name_jp: monster.nameJp,
        signature_move: monster.signatureMove,
        trait: monster.trait,
        icon_name: monster.iconName,
        sort_name: monster.sortName,
      };
    });
    return data;
  } catch (error) {
    console.error("Failed to fetch Monsters: ", error);
    throw error;
  }
};


export const fetchMonsterById = async (id: number): Promise<Monster> => {
  try {
    const response = await axios.get(API_URL + "/monsterId/" + id); // Adjust the endpoint as needed
    const monster: any = response.data;
    const data: Monster = {
      unique: "Monster",
      id: monster.id, // _id in db
      monsterClass: monster.monsterClass, // class in db
      name: monster.name,
      name_de: monster.nameDe,
      name_fr: monster.nameFr,
      name_es: monster.nameEs,
      name_it: monster.nameIt,
      name_jp: monster.nameJp,
      signature_move: monster.signatureMove,
      trait: monster.trait,
      icon_name: monster.iconName,
      sort_name: monster.sortName,
    }

    return data;
  } catch (error) {
    console.error("Failed to fetch Location: ", error);
    throw error;
  }
};
