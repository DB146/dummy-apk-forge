package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public final class x {
    public static String a(h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
