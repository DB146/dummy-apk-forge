package K0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5935a;

    public r() {
        this.f5935a = false;
    }

    public r(boolean z8) {
        this.f5935a = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f5935a == ((r) obj).f5935a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.f5935a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f5935a + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }
}
