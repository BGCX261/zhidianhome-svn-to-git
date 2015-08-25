package com.zd.model.parser;

import com.google.inject.Inject;
import com.google.inject.Provider;

public final class ParserFactory {

	@Inject
	public static Provider<AddSongListParser> AddSongProvider;

	@Inject
	public static Provider<AuthenticateDeviceParser> AuthenticateDeviceProvider;

	@Inject
	public static Provider<CamerasParser> CamerasProvider;

	@Inject
	public static Provider<CustomButtonsParser> CustomButtonsParserProvider;

	@Inject
	public static Provider<GetAlbumLookupParser> GetAlbumLookupProvider;

	@Inject
	public static Provider<GetAlbumParser> GetAlbumProvider;

	@Inject
	public static Provider<GetAlbumsParser> GetAlbumsProvider;

	@Inject
	public static Provider<GetArtistAlbumsParser> GetArtistAlbumsProvider;

	@Inject
	public static Provider<GetArtistsParser> GetArtistsProvider;

	@Inject
	public static Provider<GetBindingsByDeviceParser> GetBindingsByDeviceProvider;

	@Inject
	public static Provider<GetBroadcastsParser> GetBroadcastsProvider;

	@Inject
	public static Provider<GetCommonNameParser> GetCommonNameProvider;

	@Inject
	public static Provider<GetDetailedAlbumsParser> GetDetailedAlbumsProvider;

	@Inject
	public static Provider<GetDevicesParser> GetDevicesProvider;

	@Inject
	public static Provider<GetGenresParser> GetGenresProvider;

	@Inject
	public static Provider<GetItemsParser> GetItemsParserProvider;

	@Inject
	public static Provider<GetMediaAvailableParser> GetMediaAvailableProvider;

	@Inject
	public static Provider<GetMovieActorsParser> GetMovieActorsProvider;

	@Inject
	public static Provider<GetMovieDirectorsParser> GetMovieDirectorsProvider;

	@Inject
	public static Provider<GetMovieGenresParser> GetMovieGenresProvider;

	@Inject
	public static Provider<GetMovieInfoParser> GetMovieInfoProvider;

	@Inject
	public static Provider<GetMovieRatingsParser> GetMovieRatingsProvider;

	@Inject
	public static Provider<GetMoviesParser> GetMoviesProvider;

	@Inject
	public static Provider<GetNetworkBindingsParser> GetNetworkBindingsProvider;

	@Inject
	public static Provider<GetPlaylistsParser> GetPlaylistsProvider;

	@Inject
	public static Provider<GetQueueInfoParser> GetQueueInfoProvider;

	@Inject
	public static Provider<GetTracksParser> GetTracksProvider;

	@Inject
	public static Provider<GetVariableParser> GetVariableProvider;

	@Inject
	public static Provider<GetVersionInfoParser> GetVersionInfoProvider;

	@Inject
	public static Provider<GetWakeupScenesParser> GetWakeupScenesProvider;

	@Inject
	public static Provider<GetWakeupSettingsParser> GetWakeupSettingsProvider;

	@Inject
	public static Provider<GetZonesParser> GetZonesProvider;

	@Inject
	public static Provider<HashParser> HashProvider;

	@Inject
	public static Provider<IdentifyDeviceParser> IdentifyDeviceProvider;

	@Inject
	public static Provider<LightingScenesParser> LightingScenesParserProvider;

	@Inject
	public static Provider<OnDataToUIParser> OnDataToUIProvider;

	@Inject
	public static Provider<OnVariableChangedParser> OnVariableChangedProvider;

	@Inject
	public static Provider<RoomStateXMLParser> RoomStateXMLParserProvider;

	@Inject
	public static Provider<ThermostatSettingsParser> ThermostatSettingsProvider;

	public static ResponseParser a(int paramInt) {
		Object localObject;
		switch (paramInt) {
		case 1:
			localObject = (ResponseParser) GetVersionInfoProvider.get();
			break;
		case 4:
			localObject = (ResponseParser) GetVariableProvider.get();
			break;
		case 5:
			localObject = (ResponseParser) OnVariableChangedProvider.get();
			break;
		case 6:
			localObject = (ResponseParser) OnDataToUIProvider.get();
			break;
		case 9:
			localObject = (ResponseParser) GetBindingsByDeviceProvider.get();
			break;
		case 10:
			localObject = (ResponseParser) GetNetworkBindingsProvider.get();
			break;
		case 12:
			localObject = (GetDevicesParser) GetDevicesProvider.get();
			((GetDevicesParser) localObject).c(4);
			break;
		case 13:
			localObject = (GetDevicesParser) GetDevicesProvider.get();
			((GetDevicesParser) localObject).c(5);
			break;
		case 14:
			localObject = (ResponseParser) GetPlaylistsProvider.get();
			break;
		case 15:
		case 17:
		case 23:
			localObject = (ResponseParser) GetAlbumProvider.get();
			break;
		case 16:
			localObject = (ResponseParser) GetTracksProvider.get();
			break;
		case 18:
		case 25:
			localObject = (ResponseParser) GetArtistsProvider.get();
			break;
		case 19:
		case 26:
			localObject = (ResponseParser) GetArtistAlbumsProvider.get();
			break;
		case 20:
			localObject = (ResponseParser) GetAlbumLookupProvider.get();
			break;
		case 21:
			localObject = (ResponseParser) GetAlbumsProvider.get();
			break;
		case 22:
			localObject = (ResponseParser) GetDetailedAlbumsProvider.get();
			break;
		case 24:
			localObject = (ResponseParser) GetGenresProvider.get();
			break;
		case 27:
			localObject = (ResponseParser) AddSongProvider.get();
			break;
		case 28:
			localObject = (ResponseParser) GetQueueInfoProvider.get();
			break;
		case 29:
			localObject = (ResponseParser) GetMoviesProvider.get();
			break;
		case 30:
			localObject = (ResponseParser) GetMovieInfoProvider.get();
			break;
		case 31:
			localObject = (ResponseParser) GetMovieRatingsProvider.get();
			break;
		case 32:
			localObject = (ResponseParser) GetMovieGenresProvider.get();
			break;
		case 33:
			localObject = (ResponseParser) GetMovieActorsProvider.get();
			break;
		case 34:
			localObject = (ResponseParser) GetMovieDirectorsProvider.get();
			break;
		case 35:
			localObject = (ResponseParser) GetMediaAvailableProvider.get();
			break;
		case 36:
		case 37:
			localObject = (ResponseParser) GetBroadcastsProvider.get();
			break;
		case 38:
			localObject = (ResponseParser) GetWakeupScenesProvider.get();
			break;
		case 39:
			localObject = (ResponseParser) GetWakeupSettingsProvider.get();
			break;
		case 40:
			localObject = (ResponseParser) GetZonesProvider.get();
			break;
		case 41:
		case 42:
		case 43:
			localObject = (ResponseParser) GetZonesProvider.get();
			break;
		case 45:
			localObject = (ResponseParser) IdentifyDeviceProvider.get();
			break;
		case 46:
			localObject = (ResponseParser) GetCommonNameProvider.get();
			break;
		case 47:
			// Ln.a("Get Thermostats Response", new Object[0]);
		case 2:
		case 3:
		case 7:
		case 8:
		case 11:
		case 44:
		default:
			localObject = null;
			break;
		case 48:
			localObject = (GetDevicesParser) GetDevicesProvider.get();
			((GetDevicesParser) localObject).c(8);
			break;
		case 49:
			localObject = (GetDevicesParser) GetDevicesProvider.get();
			((GetDevicesParser) localObject).c(9);
		}
		return (ResponseParser) localObject;
	}
}
