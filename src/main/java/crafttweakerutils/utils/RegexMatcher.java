package crafttweakerutils.utils;

import crafttweaker.annotations.ZenRegister;
import stanhebben.zenscript.annotations.Optional;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenGetter;
import stanhebben.zenscript.annotations.ZenMethod;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

@ZenClass("mods.ctutils.utils.RegexMatcher")
@ZenRegister
public class RegexMatcher {

    @ZenGetter("CANNON_EQ")
    public static int getCannonEq() { return Pattern.CANON_EQ; }

    @ZenGetter("CASE_INSENSITIVE")
    public static int getCaseInsensitive() { return Pattern.CASE_INSENSITIVE; }

    @ZenGetter("COMMENTS")
    public static int getComments() { return Pattern.COMMENTS; }

    @ZenGetter("DOTALL")
    public static int getDotAll() { return Pattern.DOTALL; }

    @ZenGetter("LITERAL")
    public static int getLiteral() { return Pattern.LITERAL; }

    @ZenGetter("MULTILINE")
    public static int getMultiline() { return Pattern.MULTILINE; }

    @ZenGetter("UNICODE_CASE")
    public static int getUnicodeCase() { return Pattern.UNICODE_CASE; }

    @ZenGetter("UNICODE_CHARACTER_CLASS")
    public static int getUnicodeCharacterClass() { return Pattern.UNICODE_CHARACTER_CLASS; }

    @ZenGetter("UNIX_LINES")
    public static int getUnixLines() { return Pattern.UNIX_LINES; }

    @ZenMethod
    public static boolean find(String input, String regex, @Optional int options)
    {
        Pattern p = Pattern.compile(regex, options);
        Matcher m = p.matcher(input);
        return m.find();
    }

}
