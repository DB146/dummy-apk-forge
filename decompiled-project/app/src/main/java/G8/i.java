package G8;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final i f4371d = new i("", "", false);

    /* renamed from: a, reason: collision with root package name */
    public final String f4372a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4373b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4374c;

    static {
        new i("\n", "  ", true);
    }

    public i(String str, String str2, boolean z8) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f4372a = str;
        this.f4373b = str2;
        this.f4374c = z8;
    }
}
