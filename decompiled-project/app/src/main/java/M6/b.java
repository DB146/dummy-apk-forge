package M6;

/* loaded from: classes.dex */
public abstract class b implements m {
    public abstract boolean a(char c10);

    @Override // M6.m
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
