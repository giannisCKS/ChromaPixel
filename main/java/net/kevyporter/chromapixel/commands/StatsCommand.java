package net.kevyporter.chromapixel.commands;

import net.kevyporter.chromapixel.util.ChatMessageComposer;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.event.ClickEvent.Action;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class StatsCommand extends CommandBase{

	private boolean isOp(ICommandSender sender)
	{
		return (MinecraftServer.getServer().isSinglePlayer()) 
				|| (!(sender instanceof EntityPlayerMP))
				|| MinecraftServer.getServer().getConfigurationManager().func_152596_g(((EntityPlayerMP)sender).getGameProfile());
	}

	public String getCommandName()
	{
		return "stats";
	}

	public int getRequiredPermissionLevel()
	{
		return 0;
	}

	public boolean canSenderUseCommand(ICommandSender sender)
	{
		return true;
	}

	public String getCommandUsage(ICommandSender sender)
	{
		return "/stats <player>";
	}

	public void processCommand(ICommandSender sender, String[] args)
	{
		try
		{
			if (args.length == 1)
			{
		        new ChatMessageComposer(args[0] + "'s Stats", EnumChatFormatting.GREEN).send(false);
		        new ChatMessageComposer("    - ", EnumChatFormatting.GOLD).appendMessage(new ChatMessageComposer("Blitz Survival Games: ", EnumChatFormatting.YELLOW).appendMessage(new ChatMessageComposer("(Click to view)", EnumChatFormatting.GRAY).addFormatting(EnumChatFormatting.ITALIC).makeClickable(Action.RUN_COMMAND, "/akjwdb bsg " + args[0], new ChatMessageComposer("Click to view ", EnumChatFormatting.GRAY).appendMessage(new ChatMessageComposer(args[0], EnumChatFormatting.AQUA).appendMessage(new ChatMessageComposer("'s stats in Blitz Survival Games.", EnumChatFormatting.GRAY)))))).send(false);
		        new ChatMessageComposer("    - ", EnumChatFormatting.GOLD).appendMessage(new ChatMessageComposer("UHC Champions: ", EnumChatFormatting.YELLOW).appendMessage(new ChatMessageComposer("(Click to view)", EnumChatFormatting.GRAY).addFormatting(EnumChatFormatting.ITALIC).makeClickable(Action.RUN_COMMAND, "/akjwdb uhc " + args[0], new ChatMessageComposer("Click to view ", EnumChatFormatting.GRAY).appendMessage(new ChatMessageComposer(args[0], EnumChatFormatting.AQUA).appendMessage(new ChatMessageComposer("'s stats in UHC Champions.", EnumChatFormatting.GRAY)))))).send(false);
		        new ChatMessageComposer("    - ", EnumChatFormatting.GOLD).appendMessage(new ChatMessageComposer("Mega Walls: ", EnumChatFormatting.YELLOW).appendMessage(new ChatMessageComposer("(Click to view)", EnumChatFormatting.GRAY).addFormatting(EnumChatFormatting.ITALIC).makeClickable(Action.RUN_COMMAND, "/akjwdb mw " + args[0], new ChatMessageComposer("Click to view ", EnumChatFormatting.GRAY).appendMessage(new ChatMessageComposer(args[0], EnumChatFormatting.AQUA).appendMessage(new ChatMessageComposer("'s stats in Mega Walls.", EnumChatFormatting.GRAY)))))).send(false);
		        new ChatMessageComposer("    - ", EnumChatFormatting.GOLD).appendMessage(new ChatMessageComposer("Walls: ", EnumChatFormatting.YELLOW).appendMessage(new ChatMessageComposer("(Click to view)", EnumChatFormatting.GRAY).addFormatting(EnumChatFormatting.ITALIC).makeClickable(Action.RUN_COMMAND, "/akjwdb w " + args[0], new ChatMessageComposer("Click to view ", EnumChatFormatting.GRAY).appendMessage(new ChatMessageComposer(args[0], EnumChatFormatting.AQUA).appendMessage(new ChatMessageComposer("'s stats in Walls.", EnumChatFormatting.GRAY)))))).send(false);
		        new ChatMessageComposer("    - ", EnumChatFormatting.GOLD).appendMessage(new ChatMessageComposer("Arena: ", EnumChatFormatting.YELLOW).appendMessage(new ChatMessageComposer("(Click to view)", EnumChatFormatting.GRAY).addFormatting(EnumChatFormatting.ITALIC).makeClickable(Action.RUN_COMMAND, "/akjwdb ar " + args[0], new ChatMessageComposer("Click to view ", EnumChatFormatting.GRAY).appendMessage(new ChatMessageComposer(args[0], EnumChatFormatting.AQUA).appendMessage(new ChatMessageComposer("'s stats in Arena.", EnumChatFormatting.GRAY)))))).send(false);
		        new ChatMessageComposer("    - ", EnumChatFormatting.GOLD).appendMessage(new ChatMessageComposer("Arcade: ", EnumChatFormatting.YELLOW).appendMessage(new ChatMessageComposer("(Click to view)", EnumChatFormatting.GRAY).addFormatting(EnumChatFormatting.ITALIC).makeClickable(Action.RUN_COMMAND, "/akjwdb ac " + args[0], new ChatMessageComposer("Click to view ", EnumChatFormatting.GRAY).appendMessage(new ChatMessageComposer(args[0], EnumChatFormatting.AQUA).appendMessage(new ChatMessageComposer("'s stats in Arcade.", EnumChatFormatting.GRAY)))))).send(false);
		        new ChatMessageComposer("    - ", EnumChatFormatting.GOLD).appendMessage(new ChatMessageComposer("Paintball: ", EnumChatFormatting.YELLOW).appendMessage(new ChatMessageComposer("(Click to view)", EnumChatFormatting.GRAY).addFormatting(EnumChatFormatting.ITALIC).makeClickable(Action.RUN_COMMAND, "/akjwdb pb " + args[0], new ChatMessageComposer("Click to view ", EnumChatFormatting.GRAY).appendMessage(new ChatMessageComposer(args[0], EnumChatFormatting.AQUA).appendMessage(new ChatMessageComposer("'s stats in Paintball.", EnumChatFormatting.GRAY)))))).send(false);
		        new ChatMessageComposer("    - ", EnumChatFormatting.GOLD).appendMessage(new ChatMessageComposer("Cops and Crims: ", EnumChatFormatting.YELLOW).appendMessage(new ChatMessageComposer("(Click to view)", EnumChatFormatting.GRAY).addFormatting(EnumChatFormatting.ITALIC).makeClickable(Action.RUN_COMMAND, "/akjwdb cac " + args[0], new ChatMessageComposer("Click to view ", EnumChatFormatting.GRAY).appendMessage(new ChatMessageComposer(args[0], EnumChatFormatting.AQUA).appendMessage(new ChatMessageComposer("'s stats in Cops and Crims.", EnumChatFormatting.GRAY)))))).send(false);
		        new ChatMessageComposer("    - ", EnumChatFormatting.GOLD).appendMessage(new ChatMessageComposer("TNTGames: ", EnumChatFormatting.YELLOW).appendMessage(new ChatMessageComposer("(Click to view)", EnumChatFormatting.GRAY).addFormatting(EnumChatFormatting.ITALIC).makeClickable(Action.RUN_COMMAND, "/akjwdb tnt " + args[0], new ChatMessageComposer("Click to view ", EnumChatFormatting.GRAY).appendMessage(new ChatMessageComposer(args[0], EnumChatFormatting.AQUA).appendMessage(new ChatMessageComposer("'s stats in TNTGames.", EnumChatFormatting.GRAY)))))).send(false);
		        new ChatMessageComposer("    - ", EnumChatFormatting.GOLD).appendMessage(new ChatMessageComposer("VampireZ: ", EnumChatFormatting.YELLOW).appendMessage(new ChatMessageComposer("(Click to view)", EnumChatFormatting.GRAY).addFormatting(EnumChatFormatting.ITALIC).makeClickable(Action.RUN_COMMAND, "/akjwdb vz " + args[0], new ChatMessageComposer("Click to view ", EnumChatFormatting.GRAY).appendMessage(new ChatMessageComposer(args[0], EnumChatFormatting.AQUA).appendMessage(new ChatMessageComposer("'s stats in VampireZ.", EnumChatFormatting.GRAY)))))).send(false);
		        new ChatMessageComposer("    - ", EnumChatFormatting.GOLD).appendMessage(new ChatMessageComposer("Quake: ", EnumChatFormatting.YELLOW).appendMessage(new ChatMessageComposer("(Click to view)", EnumChatFormatting.GRAY).addFormatting(EnumChatFormatting.ITALIC).makeClickable(Action.RUN_COMMAND, "/akjwdb q " + args[0], new ChatMessageComposer("Click to view ", EnumChatFormatting.GRAY).appendMessage(new ChatMessageComposer(args[0], EnumChatFormatting.AQUA).appendMessage(new ChatMessageComposer("'s stats in Quake.", EnumChatFormatting.GRAY)))))).send(false);
		        new ChatMessageComposer("    - ", EnumChatFormatting.GOLD).appendMessage(new ChatMessageComposer("Warlords: ", EnumChatFormatting.YELLOW).appendMessage(new ChatMessageComposer("(Click to view)", EnumChatFormatting.GRAY).addFormatting(EnumChatFormatting.ITALIC).makeClickable(Action.RUN_COMMAND, "/akjwdb war " + args[0], new ChatMessageComposer("Click to view ", EnumChatFormatting.GRAY).appendMessage(new ChatMessageComposer(args[0], EnumChatFormatting.AQUA).appendMessage(new ChatMessageComposer("'s stats in Warlords.", EnumChatFormatting.GRAY)))))).send(false);
			}
			else {
				Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + getCommandUsage(sender)));
			}
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
	}

}
