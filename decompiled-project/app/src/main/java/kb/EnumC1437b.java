package kb;

import hb.InterfaceC1269b;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: kb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1437b implements InterfaceC1269b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1437b f19070a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC1437b[] f19071b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kb.b] */
    static {
        ?? r02 = new Enum("DISPOSED", 0);
        f19070a = r02;
        f19071b = new EnumC1437b[]{r02};
    }

    public static void a(AtomicReference atomicReference) {
        InterfaceC1269b interfaceC1269b;
        InterfaceC1269b interfaceC1269b2 = (InterfaceC1269b) atomicReference.get();
        EnumC1437b enumC1437b = f19070a;
        if (interfaceC1269b2 == enumC1437b || (interfaceC1269b = (InterfaceC1269b) atomicReference.getAndSet(enumC1437b)) == enumC1437b || interfaceC1269b == null) {
            return;
        }
        interfaceC1269b.b();
    }

    public static boolean d(InterfaceC1269b interfaceC1269b) {
        return interfaceC1269b == f19070a;
    }

    public static boolean f(AtomicReference atomicReference, InterfaceC1269b interfaceC1269b) {
        while (true) {
            InterfaceC1269b interfaceC1269b2 = (InterfaceC1269b) atomicReference.get();
            if (interfaceC1269b2 == f19070a) {
                if (interfaceC1269b == null) {
                    return false;
                }
                interfaceC1269b.b();
                return false;
            }
            while (!atomicReference.compareAndSet(interfaceC1269b2, interfaceC1269b)) {
                if (atomicReference.get() != interfaceC1269b2) {
                    break;
                }
            }
            return true;
        }
    }

    public static boolean i(AtomicReference atomicReference, InterfaceC1269b interfaceC1269b) {
        while (true) {
            InterfaceC1269b interfaceC1269b2 = (InterfaceC1269b) atomicReference.get();
            if (interfaceC1269b2 == f19070a) {
                if (interfaceC1269b == null) {
                    return false;
                }
                interfaceC1269b.b();
                return false;
            }
            while (!atomicReference.compareAndSet(interfaceC1269b2, interfaceC1269b)) {
                if (atomicReference.get() != interfaceC1269b2) {
                    break;
                }
            }
            if (interfaceC1269b2 == null) {
                return true;
            }
            interfaceC1269b2.b();
            return true;
        }
    }

    public static boolean j(AtomicReference atomicReference, InterfaceC1269b interfaceC1269b) {
        Objects.requireNonNull(interfaceC1269b, "d is null");
        while (!atomicReference.compareAndSet(null, interfaceC1269b)) {
            if (atomicReference.get() != null) {
                interfaceC1269b.b();
                if (atomicReference.get() == f19070a) {
                    return false;
                }
                com.bumptech.glide.d.t(new IllegalStateException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean o(InterfaceC1269b interfaceC1269b, InterfaceC1269b interfaceC1269b2) {
        if (interfaceC1269b2 == null) {
            com.bumptech.glide.d.t(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC1269b == null) {
            return true;
        }
        interfaceC1269b2.b();
        com.bumptech.glide.d.t(new IllegalStateException("Disposable already set!"));
        return false;
    }

    public static EnumC1437b valueOf(String str) {
        return (EnumC1437b) Enum.valueOf(EnumC1437b.class, str);
    }

    public static EnumC1437b[] values() {
        return (EnumC1437b[]) f19071b.clone();
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return true;
    }
}
