public class FlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean canBePack = false;
        int maxBig = goal % 5;

        if ((bigCount * 5) + smallCount >= goal) {
            if ((goal - maxBig) >= 0) {
                if ((smallCount >= maxBig)) {
                    canBePack = true;
                }
            }
        }
        return canBePack;
    }
}
