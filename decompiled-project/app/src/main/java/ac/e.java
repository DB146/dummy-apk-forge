package ac;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f12833a;

    public e(String pattern) {
        kotlin.jvm.internal.l.e(pattern, "pattern");
        Pattern compile = Pattern.compile(pattern);
        kotlin.jvm.internal.l.d(compile, "compile(...)");
        this.f12833a = compile;
    }

    public e(String pattern, int i7) {
        f[] fVarArr = f.f12834a;
        kotlin.jvm.internal.l.e(pattern, "pattern");
        Pattern compile = Pattern.compile(pattern, 66);
        kotlin.jvm.internal.l.d(compile, "compile(...)");
        this.f12833a = compile;
    }

    public static r8.o a(e eVar, String input) {
        eVar.getClass();
        kotlin.jvm.internal.l.e(input, "input");
        Matcher matcher = eVar.f12833a.matcher(input);
        kotlin.jvm.internal.l.d(matcher, "matcher(...)");
        if (matcher.find(0)) {
            return new r8.o(matcher, input);
        }
        return null;
    }

    public final r8.o b(int i7, String input) {
        kotlin.jvm.internal.l.e(input, "input");
        Matcher region = this.f12833a.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i7, input.length());
        if (region.lookingAt()) {
            return new r8.o(region, input);
        }
        return null;
    }

    public final r8.o c(String input) {
        kotlin.jvm.internal.l.e(input, "input");
        Matcher matcher = this.f12833a.matcher(input);
        kotlin.jvm.internal.l.d(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new r8.o(matcher, input);
        }
        return null;
    }

    public final boolean d(CharSequence input) {
        kotlin.jvm.internal.l.e(input, "input");
        return this.f12833a.matcher(input).matches();
    }

    public final String e(String input) {
        kotlin.jvm.internal.l.e(input, "input");
        String replaceAll = this.f12833a.matcher(input).replaceAll("");
        kotlin.jvm.internal.l.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.f12833a.toString();
        kotlin.jvm.internal.l.d(pattern, "toString(...)");
        return pattern;
    }
}
