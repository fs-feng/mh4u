import axios from "axios";
import {Location} from "../types/types";
const API_URL = "http:/10.0.2.2:8080";

export const fetchLocations = async () => {
  try {
    const response = await axios.get(API_URL + "/allLocations");
    const data: Location[] = response.data.map((location: any) => {
      return {
        unique: "Location",
        id: location.id,
        name: location.name,
        name_de: location.nameDe,
        name_fr: location.nameFr,
        name_es: location.nameEs,
        name_it: location.nameIt,
        name_jp: location.nameJp,
        map: location.map,
      };
    });
    return data;
  } catch (error) {
    console.error("Failed to fetch Locations: ", error);
    throw error;
  }
};

export const fetchLocationById = async (id: number): Promise<Location> => {
  try {
    const response = await axios.get(API_URL + "/locationId/" + id); // Adjust the endpoint as needed
    const location: any = response.data;
    const data: Location = {
      unique: "Location",
      id: location.id,
      name: location.name,
      name_de: location.nameDe,
      name_fr: location.nameFr,
      name_es: location.nameEs,
      name_it: location.nameIt,
      name_jp: location.nameJp,
      map: location.map,
    }

    return data;
  } catch (error) {
    console.error("Failed to fetch Location: ", error);
    throw error;
  }
};