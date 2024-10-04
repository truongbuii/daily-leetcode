import java.util.Arrays;

public class DividePlayersIntoTeamsofEqualSkill {
    public static long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length;
        int totalSkill = skill[0] + skill[n - 1];
        long res = 0;

        for (int i = 0; i < n/2; i++) {
            if (skill[i] + skill[n - i - 1] != totalSkill) {
                return -1;
            }
            res += (long) skill[i] * skill[n - i - 1];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(dividePlayers(new int[]{1,1,2,3}));
    }
}
