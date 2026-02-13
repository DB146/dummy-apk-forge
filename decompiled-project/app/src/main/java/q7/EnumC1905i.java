package q7;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q7.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1905i implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1905i f23535a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC1905i[] f23536b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, q7.i] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f23535a = r02;
        f23536b = new EnumC1905i[]{r02};
    }

    public static EnumC1905i valueOf(String str) {
        return (EnumC1905i) Enum.valueOf(EnumC1905i.class, str);
    }

    public static EnumC1905i[] values() {
        return (EnumC1905i[]) f23536b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
