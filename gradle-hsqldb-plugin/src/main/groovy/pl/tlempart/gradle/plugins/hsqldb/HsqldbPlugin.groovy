package pl.tlempart.gradle.plugins.hsqldb

import org.gradle.api.Plugin;
import org.gradle.api.Project;

class HsqldbPlugin implements Plugin<Project> {

	void apply(Project project) {
		
		project.task('start') {
			def classpath = project.configurations.hsqldb.collect { it.toURI().toURL() }.join(':')
			
			"java -cp $classpath org.hsqldb.Server -database.0 file:mydb -dbname.0 xdb".execute()
		}
	}
}
