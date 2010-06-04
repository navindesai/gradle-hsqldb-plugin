package pl.tlempart.gradle.plugins.hsqldb

import org.gradle.api.Project;
import org.gradle.testfixtures.ProjectBuilder;

import spock.lang.Specification;


class HsqldbPluginSpec extends Specification {
	
	def "check if all tasks are accessible"() {
		setup:
		Project project = ProjectBuilder.builder().build()
		
		when:
		project.apply plugin: 'hsqldb'
		
		then:
		project.tasks.startDatabase instanceof HsqldbStartTask
		project.tasks.stopDatabase instanceof HsqldbStopTask
	}	
}
