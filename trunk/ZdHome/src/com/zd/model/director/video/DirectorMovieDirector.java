package com.zd.model.director.video;

import com.zd.model.command.CommandFactory;
import com.zd.model.command.ContainerMoviesCommand;
import com.zd.model.command.GetDirectorMoviesCommand;

public class DirectorMovieDirector // extends DirectorMoviesCollection
// implements MovieDirector
{
	public ContainerMoviesCommand getContainerMoviesCommand() {
		GetDirectorMoviesCommand localGetDirectorMoviesCommand = (GetDirectorMoviesCommand) CommandFactory.GetDirectorMoviesProvider
				.get();
		// localGetDirectorMoviesCommand.a(au());
		// localGetDirectorMoviesCommand.a("director", this);
		return localGetDirectorMoviesCommand;
	}
}
