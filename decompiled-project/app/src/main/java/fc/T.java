package fc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public static final T f17103a;

    /* renamed from: b, reason: collision with root package name */
    public static final T f17104b;

    /* renamed from: c, reason: collision with root package name */
    public static final T f17105c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ T[] f17106d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, fc.T] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, fc.T] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, fc.T] */
    static {
        ?? r02 = new Enum("START", 0);
        f17103a = r02;
        ?? r12 = new Enum("STOP", 1);
        f17104b = r12;
        ?? r22 = new Enum("STOP_AND_RESET_REPLAY_CACHE", 2);
        f17105c = r22;
        f17106d = new T[]{r02, r12, r22};
    }

    public static T valueOf(String str) {
        return (T) Enum.valueOf(T.class, str);
    }

    public static T[] values() {
        return (T[]) f17106d.clone();
    }
}
