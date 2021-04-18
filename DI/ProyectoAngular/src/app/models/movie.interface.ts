export interface Movie {
    uid: string;
    title: string;
    director: string;
    description: string;
    photoURL?: string;
    seen: boolean;
}