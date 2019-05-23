package com.LinhDoraemon.utils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Skull;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Base64;
import java.util.UUID;

public class CSkull {

	//Fish
	public static final String ANCHOVY = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjJmYzlmNzhjZTU5OTFjYmVmZjgxNDIwMjg5NGY4YWIyYTQ3MTJlNDIzYWUzN2UyZGEyNWFhZmYyYWMzYiJ9fX0=";
	public static final String TUNA = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2M2ZWEzOTQzNTgxOGNjMTBjOTg0ZjE5MzVkYzZhNTRkZjFlNTQ3ZWVkZTM3ODljZmFhZmQyMDNjOWZhNmQxMyJ9fX0=";
	public static final String SARDINE = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjZDcxZmJiYmJiNjZjN2JhZjc4ODFmNDE1YzY0ZmE4NGY2NTA0OTU4YTU3Y2NkYjg1ODkyNTI2NDdlYSJ9fX0=";
	public static final String BREAM = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWQ3MzFlMGU4YmYwNjI5NjVlODkwNGU5ZWZjMWZkZTMxM2NmODRkNTMxNDg3YzI2Njg2NDk5MGJkY2NkN2I1NCJ9fX0=";
	public static final String SALMON = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWZiZGYxMDMxN2E3YTYzMTVjM2NiYWY3ZWRjNTkwZjBkOTc3MTRiZDY5OWM4NjE1YTI0ZjcyYmI4YTliYyJ9fX0=";
	public static final String CARP = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzg5MmQ3ZGQ2YWFkZjM1Zjg2ZGEyN2ZiNjNkYTRlZGRhMjExZGY5NmQyODI5ZjY5MTQ2MmE0ZmIxY2FiMCJ9fX0=";
	public static final String RED_MULLET = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNThkYTFhMGEyYTEzZGQyMDliZmMyNTI5ZDljN2MyOWEyOWRkOWEyM2ZmNGI4MGIzOGI4OTk2MTc3MmU4MDM5ZSJ9fX0=";
	public static final String HERRING = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTgwODRjNjkxNDljZDE0M2M5NTQ0NTJiNTJmZWQwOTU3Y2YyNjRmN2U0OGIwOTEwYWJiZWI1Y2U4OTg5NTIxIn19fQ==";
	public static final String DORADO = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTM1M2VhNmE5MGQ3ZmE3N2Y4ZTQ3OGFiYTk5YTk3OGFjZDlhNTJmOThhMzZiNjc5ODkwMWI4NzAzM2ZiNDRmYiJ9fX0=";
	public static final String OCTOPUS = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzZmYzEzYzE1Mzk2MzEyNzM0N2FkMWRmOWI3Y2NhNDhiMjU1MGYwMTQ1MjcxYmFmZjE0OTEyNThkODIzNWZiIn19fQ==";
	public static final String SQUID = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODVlZjQ2MjU1YzE1NmI0NjVkYmY4M2M0MWNhMTQ1ZTlmNTdiMGU4N2E0ZTZhMmExNDNhYmFiN2Y4NTRiOTgifX19";
	public static final String SHAD = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDg4YmE4YmI1MGI3OWU0NDFlNDdiN2U0NTI3NjRkNWZmZjY2OTM3NzlkMmRhZGQ5ZjdmNTJmOThkN2VhMCJ9fX0=";
	
	//Decorate
	public static final String TELEVISION = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjIxYWIxZGUxODFlYmZkNmFlYjE2YTZlZjMyYTEwZmY4YWY3ZGY3MDY4ZDcxOWNiYjM4MDAxMDI2ZGY5ZDQwMCJ9fX0=";
	
	@Deprecated
	public static ItemStack itemFromName(String name) {
		ItemStack item = getPlayerSkullItem();

		return itemWithName(item, name);
	}

	/**
	 * Creates a player skull based on a player's name.
	 *
	 * @param item The item to apply the name to
	 * @param name The Player's name
	 * @return The head of the Player
	 *
	 * @deprecated names don't make for good identifiers
	 */
	@Deprecated
	public static ItemStack itemWithName(ItemStack item, String name) {
		notNull(item, "item");
		notNull(name, "name");

		return Bukkit.getUnsafe().modifyItemStack(item,
				"{SkullOwner:\"" + name + "\"}"
		);
	}

	/**
	 * Creates a player skull with a UUID. 1.13 only.
	 *
	 * @param id The Player's UUID
	 * @return The head of the Player
	 */
	public static ItemStack itemFromUuid(UUID id) {
		ItemStack item = getPlayerSkullItem();

		return itemWithUuid(item, id);
	}

	/**
	 * Creates a player skull based on a UUID. 1.13 only.
	 *
	 * @param item The item to apply the name to
	 * @param id The Player's UUID
	 * @return The head of the Player
	 */
	public static ItemStack itemWithUuid(ItemStack item, UUID id) {
		notNull(item, "item");
		notNull(id, "id");

		SkullMeta meta = (SkullMeta) item.getItemMeta();
		meta.setOwner(Bukkit.getOfflinePlayer(id).getName());
		item.setItemMeta(meta);

		return item;
	}

	/**
	 * Creates a player skull based on a Mojang server URL.
	 *
	 * @param url The URL of the Mojang skin
	 * @return The head associated with the URL
	 */
	public static ItemStack itemFromUrl(String url) {
		ItemStack item = getPlayerSkullItem();

		return itemWithUrl(item, url);
	}


	/**
	 * Creates a player skull based on a Mojang server URL.
	 *
	 * @param item The item to apply the skin to
	 * @param url The URL of the Mojang skin
	 * @return The head associated with the URL
	 */
	public static ItemStack itemWithUrl(ItemStack item, String url) {
		notNull(item, "item");
		notNull(url, "url");

		return skullWithBase64(item, urlToBase64(url));
	}

	/**
	 * Creates a player skull based on a base64 string containing the link to the skin.
	 *
	 * @param base64 The base64 string containing the texture
	 * @return The head with a custom texture
	 */
	public static ItemStack itemFromBase64(String base64) {
		ItemStack item = getPlayerSkullItem();
		return skullWithBase64(item, base64);
	}

	/**
	 * Applies the base64 string to the ItemStack.
	 *
	 * @param item The ItemStack to put the base64 onto
	 * @param base64 The base64 string containing the texture
	 * @return The head with a custom texture
	 */
	public static ItemStack skullWithBase64(ItemStack item, String base64) {
		notNull(item, "item");
		notNull(base64, "base64");

		UUID hashAsId = new UUID(base64.hashCode(), base64.hashCode());
		return Bukkit.getUnsafe().modifyItemStack(item,
				"{SkullOwner:{Id:\"" + hashAsId + "\",Properties:{textures:[{Value:\"" + base64 + "\"}]}}}"
		);
	}

	/**
	 * Sets the block to a skull with the given name.
	 *
	 * @param block The block to set
	 * @param name The player to set it to
	 *
	 * @deprecated names don't make for good identifiers
	 */
	@Deprecated
	public static void blockWithName(Block block, String name) {
		notNull(block, "block");
		notNull(name, "name");

		setBlockType(block);
		((Skull) block.getState()).setOwningPlayer(Bukkit.getOfflinePlayer(name));
	}

	/**
	 * Sets the block to a skull with the given UUID.
	 *
	 * @param block The block to set
	 * @param id The player to set it to
	 */
	public static void blockWithUuid(Block block, UUID id) {
		notNull(block, "block");
		notNull(id, "id");

		setBlockType(block);
		((Skull) block.getState()).setOwningPlayer(Bukkit.getOfflinePlayer(id));
	}

	/**
	 * Sets the block to a skull with the given UUID.
	 *
	 * @param block The block to set
	 * @param url The mojang URL to set it to use
	 */
	public static void blockWithUrl(Block block, String url) {
		notNull(block, "block");
		notNull(url, "url");

		blockWithBase64(block, urlToBase64(url));
	}

	/**
	 * Sets the block to a skull with the given UUID.
	 *
	 * @param block The block to set
	 * @param base64 The base64 to set it to use
	 */
	public static void blockWithBase64(Block block, String base64) {
		notNull(block, "block");
		notNull(base64, "base64");

		UUID hashAsId = new UUID(base64.hashCode(), base64.hashCode());

		String args = String.format(
				"%d %d %d %s",
				block.getX(),
				block.getY(),
				block.getZ(),
				"{Owner:{Id:\"" + hashAsId + "\",Properties:{textures:[{Value:\"" + base64 + "\"}]}}}"
		);

		if (newerApi()) {
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "data merge block " + args);
		} else {
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"blockdata " + args);
		}
	}

	private static boolean newerApi() {
		try {

			Material.valueOf("PLAYER_HEAD");
			return true;

		} catch (IllegalArgumentException e) { // If PLAYER_HEAD doesn't exist
			return false;
		}
	}

	private static ItemStack getPlayerSkullItem() {
		if (newerApi()) {
			return new ItemStack(Material.valueOf("PLAYER_HEAD"));
		} else {
			return new ItemStack(Material.valueOf("SKULL_ITEM"), 1, (byte) 3);
		}
	}

	private static void setBlockType(Block block) {
		try {
			block.setType(Material.valueOf("PLAYER_HEAD"), false);
		} catch (IllegalArgumentException e) {
			block.setType(Material.valueOf("SKULL"), false);
		}
	}

	private static void notNull(Object o, String name) {
		if (o == null) {
			throw new NullPointerException(name + " should not be null!");
		}
	}

	private static String urlToBase64(String url) {

		URI actualUrl;
		try {
			actualUrl = new URI(url);
		} catch (URISyntaxException e) {
			throw new RuntimeException(e);
		}
		String toEncode = "{\"textures\":{\"SKIN\":{\"url\":\"" + actualUrl.toString() + "\"}}}";
		return Base64.getEncoder().encodeToString(toEncode.getBytes());
	}
}