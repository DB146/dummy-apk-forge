package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.zzaep;
import com.google.ads.interactivemedia.v3.internal.zzaet;
import java.io.IOException;

/* loaded from: classes.dex */
public class zzaep<MessageType extends zzaet<MessageType, BuilderType>, BuilderType extends zzaep<MessageType, BuilderType>> extends zzada<MessageType, BuilderType> {
    protected zzaet zza;
    private final zzaet zzb;

    public zzaep(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzaQ()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzaA();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaga
    public final /* synthetic */ zzafz zzaR() {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzada
    /* renamed from: zzai, reason: merged with bridge method [inline-methods] */
    public final zzaep clone() {
        zzaep zzaepVar = (zzaep) this.zzb.zzj(5, null, null);
        zzaepVar.zza = zzam();
        return zzaepVar;
    }

    public final zzaep zzaj(byte[] bArr, int i7, int i10, zzaef zzaefVar) {
        if (!this.zza.zzaQ()) {
            zzap();
        }
        try {
            zzagh.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i10, new zzade(zzaefVar));
            return this;
        } catch (zzafc e2) {
            throw e2;
        } catch (IOException e10) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e10);
        } catch (IndexOutOfBoundsException unused) {
            throw zzafc.zzi();
        }
    }

    public final MessageType zzak() {
        MessageType zzam = zzam();
        if (zzam.zzaP()) {
            return zzam;
        }
        throw new zzahi(zzam);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafy
    /* renamed from: zzal, reason: merged with bridge method [inline-methods] */
    public MessageType zzam() {
        if (!this.zza.zzaQ()) {
            return (MessageType) this.zza;
        }
        this.zza.zzaK();
        return (MessageType) this.zza;
    }

    public final void zzao() {
        if (this.zza.zzaQ()) {
            return;
        }
        zzap();
    }

    public void zzap() {
        zzaet zzaA = this.zzb.zzaA();
        zzagh.zza().zzb(zzaA.getClass()).zzg(zzaA, this.zza);
        this.zza = zzaA;
    }
}
