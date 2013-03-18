package de.codecentric.integration.demo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.ws.client.core.WebServiceTemplate;

import de.codecentric.integration.demo.config.OpenLigaConfig;
import de.msiggi.sportsdata.webservices.GetTeamsByLeagueSaison;
import de.msiggi.sportsdata.webservices.Team;
import de.msiggi.sportsdata.webservices.TeamsByLeagueSaison;


/**
 * the main-app
 * 
 * @author max.hartmann
 *
 */
public class OpenLigaClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = null;
		try {
			ctx = new AnnotationConfigApplicationContext();
			ctx.getEnvironment().setActiveProfiles("openLiga");
			ctx.register(OpenLigaConfig.class);
			ctx.refresh();
			WebServiceTemplate template = ctx.getBean(WebServiceTemplate.class);
			
			//get all teams
			GetTeamsByLeagueSaison teamsRequest = new GetTeamsByLeagueSaison();
			teamsRequest.setLeagueShortcut("BL1");
			teamsRequest.setLeagueSaison("2013");
			TeamsByLeagueSaison  teams = (TeamsByLeagueSaison) template.marshalSendAndReceive(teamsRequest);
			for(Team team  : teams.getTeamList()) {
				System.out.println(team.getTeamName());
			}
			
		} finally {
			if (ctx != null) {
				ctx.close();
			}
		}
	}
}
