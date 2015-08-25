package com.zd.model.command;

import com.google.inject.Inject;
import com.google.inject.Provider;

public final class CommandFactory {

	@Inject
	public static Provider<AllZonesOffCommand> AllZonesOffProvider;

	@Inject
	public static Provider<AuthenticateDeviceCommand> AuthenticateDeviceProvider;

	@Inject
	public static Provider<EnableEventsCommand> EnableEventsProvider;

	@Inject
	public static Provider<GetActorMoviesCommand> GetActorMoviesProvider;

	@Inject
	public static Provider<GetAlbumIdsCommand> GetAlbumIdsProvider;

	@Inject
	public static Provider<GetAlbumLookupCommand> GetAlbumLookupProvider;

	@Inject
	public static Provider<GetAlbumCommand> GetAlbumProvider;

	@Inject
	public static Provider<GetArtistAlbumsCommand> GetArtistsAlbumsProvider;

	@Inject
	public static Provider<GetArtistGenreAlbumsCommand> GetArtistsGenreAlbumsProvider;

	@Inject
	public static Provider<GetArtistsCommand> GetArtistsProvider;

	@Inject
	public static Provider<GetBindingsByDeviceCommand> GetBindingsByDeviceProvider;

	@Inject
	public static Provider<GetCommonNameCommand> GetCommonNameProvider;

	@Inject
	public static Provider<GetDetailedAlbumsCommand> GetDetailedAlbumsProvider;

	@Inject
	public static Provider<GetDevicesForRoomCommand> GetDevicesForRoomProvider;

	@Inject
	public static Provider<GetDirectorMoviesCommand> GetDirectorMoviesProvider;

	@Inject
	public static Provider<GetGenreArtistsCommand> GetGenreArtistsProvider;

	@Inject
	public static Provider<GetGenreMoviesCommand> GetGenreMoviesProvider;

	@Inject
	public static Provider<GetGenresCommand> GetGenresProvider;

	@Inject
	public static Provider<GetItemsCommand> GetItemsProvider;

	@Inject
	public static Provider<GetMediaAvailableCommand> GetMediaAvailableProvider;

	@Inject
	public static Provider<GetMovieActorsCommand> GetMovieActorsProvider;

	@Inject
	public static Provider<GetMovieDirectorsCommand> GetMovieDirectorsProvider;

	@Inject
	public static Provider<GetMovieGenresCommand> GetMovieGenresProvider;

	@Inject
	public static Provider<GetMovieInfoCommand> GetMovieInfoProvider;

	@Inject
	public static Provider<GetMovieRatingsCommand> GetMovieRatingsProvider;

	@Inject
	public static Provider<MoviesCommand> GetMoviesProvider;

	@Inject
	public static Provider<GetNetworkBindingsCommand> GetNetworkBindingsProvider;

	@Inject
	public static Provider<GetPlaylistCommand> GetPlaylistProvider;

	@Inject
	public static Provider<GetPlaylistsCommand> GetPlaylistsProvider;

	@Inject
	public static Provider<GetRatingMoviesCommand> GetRatingMoviesProvider;

	@Inject
	public static Provider<GetSongCommand> GetSongProvider;

	@Inject
	public static Provider<GetThermostatSettingsCommand> GetThermostatSettingsProvider;

	@Inject
	public static Provider<GetVariableCommand> GetVariableProvider;

	@Inject
	public static Provider<GetVersionInfoCommand> GetVersionInfoProvider;

	@Inject
	public static Provider<GetZonesCommand> GetZonesProvider;

	@Inject
	public static Provider<IdentifyDeviceCommand> IdentifyDeviceProvider;

	@Inject
	public static Provider<JoinRoomsToZoneCommand> JoinRoomsToZoneProvider;

	@Inject
	public static Provider<PulseVolumeCommand> PulseVolumeProvider;

	@Inject
	public static Provider<RegisterEventListenerCommand> RegisterEventListenerProvider;

	@Inject
	public static Provider<RemoveRoomsFromZoneCommand> RemoveRoomsFromZoneProvider;

	@Inject
	public static Provider<SendToDeviceCommand> SendToDeviceProvider;

	@Inject
	public static Provider<SetVolumeCommand> SetVolumeProvider;

	@Inject
	public static Provider<StartChangingVolumeCommand> StartChangingVolumeProvider;

	@Inject
	public static Provider<StopChangingVolumeCommand> StopChangingVolumeProvider;

	@Inject
	public static Provider<UnregisterEventListenerCommand> UnregisterEventListenerProvider;
}
