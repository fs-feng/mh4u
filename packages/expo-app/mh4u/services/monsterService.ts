import axios from "axios";

const API_URL = "http:/10.0.2.2:8080";

export const fetchMonsters = async () => {
  try {
    const response = await axios.get(API_URL + "/allMonsters");
    return response.data;
  } catch (error) {
    console.error("Failed to fetch Monsters: ", error);
    throw error;
  }
};
