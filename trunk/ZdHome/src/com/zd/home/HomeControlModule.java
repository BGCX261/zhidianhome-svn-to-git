// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.zd.home;

import roboguice.config.AbstractAndroidModule;

import com.zd.home.service.FileService;
import com.zd.home.service.FileServiceImpl;
import com.zd.model.Control4Director;
import com.zd.model.Director;
import com.zd.model.audio.Control4Rhapsody;
import com.zd.model.audio.DirectorZoneManager;
import com.zd.model.audio.ZoneManager;
import com.zd.model.command.CommandFactory;
import com.zd.model.device.DeviceFactory;
import com.zd.model.parser.ParserFactory;
import com.zd.model.rhapsody.Rhapsody;

public class HomeControlModule extends AbstractAndroidModule {

	public HomeControlModule() {
	}

	@Override
	protected void configure() {
		this.bind(Director.class).to(Control4Director.class);
		this.bind(ZoneManager.class).to(DirectorZoneManager.class);
		this.bind(FileService.class).to(FileServiceImpl.class);
		this.bind(Rhapsody.class).to(Control4Rhapsody.class);
		// this.bind(Print.class).to(CustomLogPrint.class);
		this.requestStaticInjection(CommandFactory.class);
		this.requestStaticInjection(ParserFactory.class);

		this.requestStaticInjection(DeviceFactory.class);
		// this.requestStaticInjection(RhapsodyCommandFactory.class);
		// this.requestStaticInjection(RhapsodyParserFactory.class);

	}
}
