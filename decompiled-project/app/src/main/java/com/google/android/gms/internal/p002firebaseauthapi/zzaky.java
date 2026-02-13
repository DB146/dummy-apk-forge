package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.firebase-auth-api.zzaky.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import h3.o;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class zzaky<MessageType extends zzaky<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzajf<MessageType, BuilderType> {
    private static Map<Class<?>, zzaky<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzann zzb = zzann.zzc();

    /* loaded from: classes.dex */
    public static abstract class zza<MessageType extends zzaky<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzaje<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        public zza(MessageType messagetype) {
            this.zzb = messagetype;
            if (messagetype.zzu()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.zza = (MessageType) messagetype.zzo();
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzamr.zza().zza((zzamr) messagetype).zza(messagetype, messagetype2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
        public /* synthetic */ Object clone() {
            zza zzaVar = (zza) this.zzb.zza(zzf.zze, null, null);
            zzaVar.zza = (MessageType) zzf();
            return zzaVar;
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzu()) {
                zzi();
            }
            zza(this.zza, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
        /* renamed from: zzb */
        public final /* synthetic */ zzaje clone() {
            return (zza) clone();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamf
        /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
        public final MessageType zze() {
            MessageType messagetype = (MessageType) zzf();
            if (messagetype.zzj()) {
                return messagetype;
            }
            throw new zzanl(messagetype);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamf
        /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
        public MessageType zzf() {
            if (!this.zza.zzu()) {
                return this.zza;
            }
            this.zza.zzs();
            return this.zza;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzame
        public final /* synthetic */ zzamc zzg() {
            return this.zzb;
        }

        public final void zzh() {
            if (this.zza.zzu()) {
                return;
            }
            zzi();
        }

        public void zzi() {
            MessageType messagetype = (MessageType) this.zzb.zzo();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzame
        public final boolean zzj() {
            return zzaky.zzb(this.zza, false);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzaky<MessageType, BuilderType> implements zzame {
        protected zzakr<zze> zzc = zzakr.zzb();

        public final zzakr<zze> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzakr) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* loaded from: classes.dex */
    public static class zzc<T extends zzaky<T, ?>> extends zzajg<T> {
        public zzc(T t5) {
        }
    }

    /* loaded from: classes.dex */
    public static class zzd<ContainingType extends zzamc, Type> extends zzakl<ContainingType, Type> {
    }

    /* loaded from: classes.dex */
    public static final class zze implements zzakt<zze> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakt
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakt
        public final zzamf zza(zzamf zzamfVar, zzamc zzamcVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakt
        public final zzaml zza(zzaml zzamlVar, zzaml zzamlVar2) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakt
        public final zzanw zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakt
        public final zzaod zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakt
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakt
        public final boolean zze() {
            throw new NoSuchMethodError();
        }
    }

    /* loaded from: classes.dex */
    public enum zzf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    private final int zza() {
        return zzamr.zza().zza((zzamr) this).zzb(this);
    }

    private static <T extends zzaky<T, ?>> T zza(T t5) {
        if (t5 == null || zzb(t5, true)) {
            return t5;
        }
        zzalf zza2 = new zzanl(t5).zza();
        zza2.getClass();
        throw zza2;
    }

    public static <T extends zzaky<T, ?>> T zza(T t5, zzajp zzajpVar, zzakk zzakkVar) {
        return (T) zza(zzb(t5, zzajpVar, zzakkVar));
    }

    private static <T extends zzaky<T, ?>> T zza(T t5, zzakb zzakbVar, zzakk zzakkVar) {
        T t10 = (T) t5.zzo();
        try {
            zzamv zza2 = zzamr.zza().zza((zzamr) t10);
            zza2.zza(t10, zzakf.zza(zzakbVar), zzakkVar);
            zza2.zzd(t10);
            return t10;
        } catch (zzalf e2) {
            if (e2.zzl()) {
                throw new zzalf(e2);
            }
            throw e2;
        } catch (zzanl e10) {
            zzalf zza3 = e10.zza();
            zza3.getClass();
            throw zza3;
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzalf) {
                throw ((zzalf) e11.getCause());
            }
            throw new zzalf(e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof zzalf) {
                throw ((zzalf) e12.getCause());
            }
            throw e12;
        }
    }

    public static <T extends zzaky<T, ?>> T zza(T t5, InputStream inputStream, zzakk zzakkVar) {
        zzakb zzakdVar;
        if (inputStream == null) {
            byte[] bArr = zzalb.zzb;
            zzakdVar = zzakb.zza(bArr, 0, bArr.length, false);
        } else {
            zzakdVar = new zzakd(inputStream);
        }
        return (T) zza(zza(t5, zzakdVar, zzakkVar));
    }

    private static <T extends zzaky<T, ?>> T zza(T t5, byte[] bArr, int i7, int i10, zzakk zzakkVar) {
        if (i10 == 0) {
            return t5;
        }
        T t10 = (T) t5.zzo();
        try {
            zzamv zza2 = zzamr.zza().zza((zzamr) t10);
            zza2.zza(t10, bArr, 0, i10, new zzajk(zzakkVar));
            zza2.zzd(t10);
            return t10;
        } catch (zzalf e2) {
            if (e2.zzl()) {
                throw new zzalf(e2);
            }
            throw e2;
        } catch (zzanl e10) {
            zzalf zza3 = e10.zza();
            zza3.getClass();
            throw zza3;
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzalf) {
                throw ((zzalf) e11.getCause());
            }
            throw new zzalf(e11);
        } catch (IndexOutOfBoundsException unused) {
            zzalf zzj = zzalf.zzj();
            zzj.getClass();
            throw zzj;
        }
    }

    public static <T extends zzaky<T, ?>> T zza(T t5, byte[] bArr, zzakk zzakkVar) {
        return (T) zza(zza(t5, bArr, 0, bArr.length, zzakkVar));
    }

    public static <T extends zzaky<?, ?>> T zza(Class<T> cls) {
        zzaky<?, ?> zzakyVar = zzc.get(cls);
        if (zzakyVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzakyVar = zzc.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzakyVar == null) {
            zzakyVar = (T) ((zzaky) zzanp.zza(cls)).zza(zzf.zzf, (Object) null, (Object) null);
            if (zzakyVar == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, zzakyVar);
        }
        return (T) zzakyVar;
    }

    public static <E> zzalc<E> zza(zzalc<E> zzalcVar) {
        return zzalcVar.zza(zzalcVar.size() << 1);
    }

    public static Object zza(zzamc zzamcVar, String str, Object[] objArr) {
        return new zzamt(zzamcVar, str, objArr);
    }

    public static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <T extends zzaky<?, ?>> void zza(Class<T> cls, T t5) {
        t5.zzt();
        zzc.put(cls, t5);
    }

    private final int zzb(zzamv<?> zzamvVar) {
        return zzamvVar == null ? zzamr.zza().zza((zzamr) this).zza(this) : zzamvVar.zza(this);
    }

    private static <T extends zzaky<T, ?>> T zzb(T t5, zzajp zzajpVar, zzakk zzakkVar) {
        zzakb zzc2 = zzajpVar.zzc();
        T t10 = (T) zza(t5, zzc2, zzakkVar);
        zzc2.zzb(0);
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zzaky<T, ?>> boolean zzb(T t5, boolean z8) {
        byte byteValue = ((Byte) t5.zza(zzf.zza, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zze2 = zzamr.zza().zza((zzamr) t5).zze(t5);
        if (z8) {
            t5.zza(zzf.zzb, zze2 ? t5 : null, null);
        }
        return zze2;
    }

    public static <E> zzalc<E> zzp() {
        return zzamq.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzamr.zza().zza((zzamr) this).zzb(this, (zzaky) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzu()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzamh.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajf
    public final int zza(zzamv zzamvVar) {
        if (zzu()) {
            int zzb2 = zzb((zzamv<?>) zzamvVar);
            if (zzb2 >= 0) {
                return zzb2;
            }
            throw new IllegalStateException(o.l(zzb2, "serialized size must be non-negative, was "));
        }
        if (zzi() != Integer.MAX_VALUE) {
            return zzi();
        }
        int zzb3 = zzb((zzamv<?>) zzamvVar);
        zzb(zzb3);
        return zzb3;
    }

    public abstract Object zza(int i7, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final void zza(zzakg zzakgVar) {
        zzamr.zza().zza((zzamr) this).zza((zzamv) this, (zzaof) zzakj.zza(zzakgVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajf
    public final void zzb(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException(o.l(i7, "serialized size must be non-negative, was "));
        }
        this.zzd = (i7 & f.API_PRIORITY_OTHER) | (this.zzd & Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzame
    public final /* synthetic */ zzamc zzg() {
        return (zzaky) zza(zzf.zzf, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajf
    public final int zzi() {
        return this.zzd & f.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzame
    public final boolean zzj() {
        return zzb(this, true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final int zzl() {
        return zza((zzamv) null);
    }

    public final <MessageType2 extends zzaky<MessageType2, BuilderType2>, BuilderType2 extends zza<MessageType2, BuilderType2>> BuilderType2 zzm() {
        return (BuilderType2) zza(zzf.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzn() {
        return (BuilderType) ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza(this);
    }

    public final MessageType zzo() {
        return (MessageType) zza(zzf.zzd, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final /* synthetic */ zzamf zzq() {
        return (zza) zza(zzf.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final /* synthetic */ zzamf zzr() {
        return ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza(this);
    }

    public final void zzs() {
        zzamr.zza().zza((zzamr) this).zzd(this);
        zzt();
    }

    public final void zzt() {
        this.zzd &= f.API_PRIORITY_OTHER;
    }

    public final boolean zzu() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }
}
