package asocial.forum

import grails.plugins.neo4j.*

@Neo4jEntity
class Post {

	String content
	
    static constraints = {
    }
}
