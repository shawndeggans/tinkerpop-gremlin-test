// You can use this file to load the air-routes graph from the Gremlin Console
//
// To execute use the console command ":load D:\\OneDrive\\Pluralsight\\Gremlin\\Project\\air-routes\\load-air-routes-graph.groovy"
//

conf = new BaseConfiguration()
conf.setProperty("gremlin.tinkergraph.vertexIdManager","LONG")
conf.setProperty("gremlin.tinkergraph.edgeIdManager","LONG")
conf.setProperty("gremlin.tinkergraph.vertexPropertyIdManager","LONG")

graph = TinkerGraph.open(conf)

// Change the path below to point to wherever you put the graphml file
dataFolderPath = "C:\\Users\\shawn\\OneDrive\\Documents\\Repos\\tinkerpop-gremlin-test\\files\\"
airRoutesFilePath = dataFolderPath + "air-routes.graphml"
graph.io(graphml()).readGraph(airRoutesFilePath)

g = graph.traversal()

:set max-iteration 1000

// Set colors for this file
:set input.prompt.color bg_black,green
:set result.prompt.color bg_black,magenta
:set number.color bg_black,yellow
:set string.color bg_black,white
:set vertex.color bg_black,red
:set edge.color bg_black,blue
:set gremlin.color bg_black,green,bold
:set T.color bg_black,green

//Define some variables for later
yvr =  g.V().has('airport','code','YVR').next()