import axios from "axios";
import {SkillTree} from "../types/types";

const API_URL = "http:/10.0.2.2:8080";

export const fetchSkillTrees = async (): Promise<SkillTree[]> => {
  try {
    const response = await axios.get(API_URL + "/allSkillTrees");
    const data: SkillTree[] = response.data.map((skillTree: any) => {
      return {
        unique: "SkillTree",
        id: skillTree.id,
        name: skillTree.name,
        name_de: skillTree.nameDe,
        name_fr: skillTree.nameFr,
        name_es: skillTree.nameEs,
        name_it: skillTree.nameIt,
        name_jp: skillTree.nameJp,
      };
    });
    return data;
  } catch (error) {
    console.error("Failed to fetch Skill Trees: ", error);
    throw error;
  }
};
