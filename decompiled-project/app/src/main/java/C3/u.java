package C3;

/* loaded from: classes.dex */
public final class u implements Appendable {

    /* renamed from: a, reason: collision with root package name */
    public final Appendable f2632a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2633b = true;

    public u(Appendable appendable) {
        this.f2632a = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c10) {
        boolean z8 = this.f2633b;
        Appendable appendable = this.f2632a;
        if (z8) {
            this.f2633b = false;
            appendable.append("  ");
        }
        this.f2633b = c10 == '\n';
        appendable.append(c10);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i7, int i10) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z8 = this.f2633b;
        Appendable appendable = this.f2632a;
        boolean z10 = false;
        if (z8) {
            this.f2633b = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i10 - 1) == '\n') {
            z10 = true;
        }
        this.f2633b = z10;
        appendable.append(charSequence, i7, i10);
        return this;
    }
}
