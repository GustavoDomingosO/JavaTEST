import java.util.Scanner;

public class TestElec {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        
        int votesTotal, nextVote;
        
        int votePMDB = 0;
        int votePSDB = 0;
        int voteNull = 0;

        System.out.println("How many votes ?");
        votesTotal = input.nextInt();

        for(int i = 0; i < votesTotal; i++) {
        	System.out.println("Declare your vote. PMDB: 15 || PSDB: 45");
        	nextVote = input.nextInt();
        	if(nextVote == 15)votePMDB++;
        	else if (nextVote == 45)votePSDB++;
        	else voteNull++;
        }
        
        input.close();
        
        if(voteNull >= Math.ceil(votesTotal/2)) System.out.println("The election was cancelled");
        else if (votePMDB > votePSDB) System.out.println("PMDB won the election");
        else if (votePMDB < votePSDB) System.out.println("PSDB won the election");
        else System.out.println("PMDB and PSDB tied");
        
        System.out.println("Votes for PMDB: " + votePMDB);
        System.out.println("Votes for PSDB: " + votePSDB);
        System.out.println("Null votes: " + voteNull);
    }
}
