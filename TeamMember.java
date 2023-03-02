package Newpackage;
class Sports{

    String getName(){

        return "Generic Sports";

    }

    void getNumberOfTeamMembers(){

        System.out.println( "Each team has n players in " + getName() );

    }

}
class Soccer extends Sports{

    @Override

    String getName(){

        return "Soccer Class";

    }
void getNumberOfTeamMembers(){

        System.out.println( "Each team has 11 players in " + getName() );

    }

}
public class TeamMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports s=new Sports();
		Soccer t=new Soccer();
		s.getName();
		s.getNumberOfTeamMembers();
		t.getName();
		t.getNumberOfTeamMembers();
	}

}
