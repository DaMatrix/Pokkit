package nl.rutgerkok.pokkit.metadata;

import org.bukkit.OfflinePlayer;
import org.bukkit.metadata.MetadataStore;
import org.bukkit.metadata.MetadataStoreBase;

/**
 * A PlayerMetadataStore stores metadata for {@link org.bukkit.entity.Player}
 * and {@link OfflinePlayer} objects.
 * <p>
 * Class has been copied from CraftBukkit.
 */
public final class PlayerMetadataStore extends MetadataStoreBase<OfflinePlayer>
		implements MetadataStore<OfflinePlayer> {
	/**
	 * Generates a unique metadata key for {@link org.bukkit.entity.Player} and
	 * {@link OfflinePlayer} using the player name.
	 *
	 * @see MetadataStoreBase#disambiguate(Object, String)
	 * @param player
	 *            the player
	 * @param metadataKey
	 *            The name identifying the metadata value
	 * @return a unique metadata key
	 */
	@Override
	protected String disambiguate(OfflinePlayer player, String metadataKey) {
		return player.getName().toLowerCase(java.util.Locale.ENGLISH) + ":" + metadataKey;
	}
}