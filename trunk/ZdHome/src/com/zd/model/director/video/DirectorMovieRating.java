package com.zd.model.director.video;

import com.zd.model.command.CommandFactory;
import com.zd.model.command.ContainerMoviesCommand;

public class DirectorMovieRating extends DirectorMoviesCollection implements
		MovieRating {
	protected ContainerMoviesCommand getContainerMoviesCommand() {
		ContainerMoviesCommand localGetContainerMoviesCommand = (ContainerMoviesCommand) CommandFactory.GetRatingMoviesProvider
				.get();
		// localGetContainerMoviesCommand.a(au());
		// localGetContainerMoviesCommand.a("rating", this);
		return localGetContainerMoviesCommand;
	}
}
