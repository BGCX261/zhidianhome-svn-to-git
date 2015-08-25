package com.zd.model.director.video;

import com.zd.model.command.CommandFactory;
import com.zd.model.command.ContainerMoviesCommand;
import com.zd.model.command.GetActorMoviesCommand;

public class DirectorMovieActor // extends DirectorMoviesCollection implements
								// MovieActor
{
	protected ContainerMoviesCommand e() {
		GetActorMoviesCommand localGetActorMoviesCommand = (GetActorMoviesCommand) CommandFactory.GetActorMoviesProvider
				.get();
		// localGetActorMoviesCommand.a(au());
		// localGetActorMoviesCommand.a("actor", this);
		return localGetActorMoviesCommand;
	}

}

/*
 * Location: E:\去哪儿\com.control4.myhome-2\classes_dex2jar.jar Qualified Name:
 * com.control4.director.video.DirectorMovieActor JD-Core Version: 0.6.0
 */