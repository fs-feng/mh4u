import { Stack } from "expo-router";
import Section from "./section/[section]";

const RootLayout = () => {
    return (
        <Stack>
            <Stack.Screen name="(tabs)" options={{ headerShown: false }} />
        </Stack>
    );
}

export default RootLayout;