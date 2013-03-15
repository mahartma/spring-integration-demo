package de.codecentric.integration.demo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.ws.client.core.WebServiceTemplate;

import de.codecentric.integration.demo.config.OpenLigaConfig;
import de.msiggi.sportsdata.webservices.GetAvailLeagues;
import de.msiggi.sportsdata.webservices.GetAvailLeaguesResponse;
import de.msiggi.sportsdata.webservices.League;


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
			GetAvailLeaguesResponse leagues = (GetAvailLeaguesResponse) template.marshalSendAndReceive(new GetAvailLeagues());
			for(League league : leagues.getGetAvailLeaguesResult().getLeagueList()) {
				System.out.println(league.getLeagueName());
			}
		} finally {
			if (ctx != null) {
				ctx.close();
			}
		}
	}
}
