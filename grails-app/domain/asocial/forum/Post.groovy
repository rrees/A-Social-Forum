package asocial.forum

import grails.plugins.neo4j.*

@Neo4jEntity
class Post {

	String content
	
	static hasOne = [user:User, forum:Forum]
	
    static constraints = {
    }
}
