/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.util;

import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AbortFederationRestoreType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AbortFederationSaveType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AlternativeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AnnounceSynchronizationPointType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ApplicationDomainType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ArrayDataType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ArrayDataType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ArrayDataTypesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ArrayDataTypesType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ArrayDatatypeEncodingType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AssociateRegionsForUpdatesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipAcquisitionIfAvailableType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipAcquisitionNotificationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipAcquisitionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipDivestitureIfWantedType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipReleaseDeniedType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeOwnershipUnavailableType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributeType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributesInScopeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.AttributesOutOfScopeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataRepresentationsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CancelAttributeOwnershipAcquisitionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CancelNegotiatedAttributeOwnershipDivestitureType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CapabilityType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CardinalityType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ChangeAttributeOrderTypeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ChangeInteractionOrderTypeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CommitRegionModificationsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmAttributeOwnershipAcquisitionCancellationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmAttributeTransportationTypeChangeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmDivestitureType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmFederationRestorationRequestType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmInteractionTransportationTypeChangeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmSynchronizationPointRegistrationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConnectType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConnectionLostType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CreateFederationExecutionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.CreateRegionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DataTypesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DeleteObjectInstanceType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DeleteRegionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DestroyFederationExecutionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DimensionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DimensionType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DimensionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DimensionsType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DimensionsType2;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableAsynchronousDeliveryType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableAttributeRelevanceAdvisorySwitchType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableAttributeScopeAdvisorySwitchType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableCallbacksType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableInteractionRelevanceAdvisorySwitchType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableObjectClassRelevanceAdvisorySwitchType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableTimeConstrainedType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisableTimeRegulationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DisconnectType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DiscoverObjectInstanceType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.DocumentRoot;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableAsynchronousDeliveryType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableAttributeRelevanceAdvisorySwitchType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableAttributeScopeAdvisorySwitchType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableCallbacksType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableInteractionRelevanceAdvisorySwitchType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableObjectClassRelevanceAdvisorySwitchType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableTimeConstrainedType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnableTimeRegulationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EndianType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataTypesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratorType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EvokeCallbackType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EvokeMultipleCallbacksType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederateRestoreCompleteType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederateSaveBegunType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederateSaveCompleteType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationRestoreBegunType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationRestoreStatusResponseType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationRestoredType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationSaveStatusResponseType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationSavedType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FederationSynchronizedType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FieldType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FixedRecordDataType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FixedRecordDataType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FixedRecordDataTypesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FixedRecordEncodingType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.FlushQueueRequestType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetAttributeHandleType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetAttributeNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetAutomaticResignDirectiveType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetAvailableDimensionsForClassAttributeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetAvailableDimensionsForInteractionClassType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetDimensionHandleSetType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetDimensionHandleType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetDimensionNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetDimensionUpperBoundType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetFederateHandleType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetFederateNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassHandleType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetKnownObjectClassHandleType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetObjectClassHandleType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetObjectClassNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetObjectInstanceHandleType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetObjectInstanceNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetOrderNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetOrderTypeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetParameterHandleType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetParameterNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetRangeBoundsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetTransportationTypeHandleType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetTransportationTypeNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetUpdateRateValueForAttributeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetUpdateRateValueType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GlyphType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GlyphType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.IdReferenceType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.IdentificationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.IdentifierType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InformAttributeOwnershipType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InitiateFederateRestoreType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InitiateFederateSaveType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InteractionClassType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InteractionClassType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.InteractionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.IsAttributeOwnedByFederateType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.JoinFederationExecutionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.KeywordType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ListFederationExecutionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.LocalDeleteObjectInstanceType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.LookaheadType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ModelIdentificationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ModelType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ModificationDateType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ModifyLookaheadType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.MultipleObjectInstanceNamesReservedType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NegotiatedAttributeOwnershipDivestitureType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NextMessageRequestAvailableType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NextMessageRequestType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NonEmptyString1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NormalizeFederateHandleType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NormalizeServiceGroupType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NoteType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.NotesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectClassType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectClassType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectInstanceNameReservedType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectModelType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ObjectsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OrderType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OwnershipType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ParameterType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ParameterType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PocType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PocType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PocTypeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ProvideAttributeValueUpdateType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PublishInteractionClassType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PublishObjectClassAttributesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryAttributeOwnershipType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryAttributeTransportationTypeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryFederationRestoreStatusType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryFederationSaveStatusType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryGALTType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryInteractionTransportationTypeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryLITSType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryLogicalTimeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.QueryLookaheadType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RateType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReceiveInteractionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReferenceType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReflectAttributeValuesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RegisterFederationSynchronizationPointType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RegisterObjectInstanceType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RegisterObjectInstanceWithRegionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReleaseMultipleObjectInstanceNamesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReleaseObjectInstanceNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReliableType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RemoveobjectinstanceType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReportAttributeTransportationTypeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReportFederationExecutionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReportInteractionTransportationTypeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestAttributeOwnershipAssumptionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestAttributeOwnershipReleaseType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestAttributeTransportationTypeChangeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestAttributeValueUpdateType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestAttributeValueUpdateWithRegionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestDivestitureConfirmationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestFederationRestoreType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestFederationSaveType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestInteractionTransportationTypeChangeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RequestRetractionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReserveMultipleObjectInstanceNamesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReserveObjectInstanceNameType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ResignFederationExecutionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ResignSwitchType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.RetractType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SecurityClassificationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SendInteractionType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SendInteractionWithRegionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ServiceUtilizationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SetAutomaticResignDirectiveType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SetRangeBoundsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SharingType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SimpleDataType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SimpleDataType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SimpleDataTypesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.Size;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.StartRegistrationForObjectClassType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.StopRegistrationForObjectClassType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SubscribeInteractionClassType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SubscribeInteractionClassWithRegionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SubscribeObjectClassAttributesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SubscribeObjectClassAttributesWithRegionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SynchronizationPointAchievedType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SynchronizationPointType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SynchronizationPointType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SynchronizationsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeAdvanceGrantType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeAdvanceRequestAvailableType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeAdvanceRequestType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeConstrainedEnabledType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeRegulationEnabledType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeStampType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TimeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TransportationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TransportationType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TransportationsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TurnInteractionsOffType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TurnInteractionsOnType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TurnUpdatesOffForObjectInstanceType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TurnUpdatesOnForObjectInstanceType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TypeType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnassociateRegionsForUpdatesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnconditionalAttributeOwnershipDivestitureType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnpublishInteractionClassType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnpublishObjectClassAttributesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnsubscribeInteractionClassType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnsubscribeInteractionClassWithRegionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnsubscribeObjectClassAttributesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UnsubscribeObjectClassAttributesWithRegionsType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateAttributeValuesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateRateType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateRatesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpperBoundType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ValueType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.VariantRecordDataType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.VariantRecordDataType1;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.VariantRecordDataTypesType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.VariantRecordEncodingType;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage
 * @generated
 */
public class OmtSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OmtPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OmtSwitch() {
		if (modelPackage == null) {
			modelPackage = OmtPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OmtPackage.UPDATE_RATES_TYPE: {
				UpdateRatesType updateRatesType = (UpdateRatesType)theEObject;
				T result = caseUpdateRatesType(updateRatesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.UPDATE_RATE_TYPE: {
				UpdateRateType updateRateType = (UpdateRateType)theEObject;
				T result = caseUpdateRateType(updateRateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.UPDATE_TYPE: {
				UpdateType updateType = (UpdateType)theEObject;
				T result = caseUpdateType(updateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.UPPER_BOUND_TYPE: {
				UpperBoundType upperBoundType = (UpperBoundType)theEObject;
				T result = caseUpperBoundType(upperBoundType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				T result = caseValueType(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.VARIANT_RECORD_DATA_TYPE: {
				VariantRecordDataType variantRecordDataType = (VariantRecordDataType)theEObject;
				T result = caseVariantRecordDataType(variantRecordDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.VARIANT_RECORD_DATA_TYPE1: {
				VariantRecordDataType1 variantRecordDataType1 = (VariantRecordDataType1)theEObject;
				T result = caseVariantRecordDataType1(variantRecordDataType1);
				if (result == null) result = caseVariantRecordDataType(variantRecordDataType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.VARIANT_RECORD_DATA_TYPES_TYPE: {
				VariantRecordDataTypesType variantRecordDataTypesType = (VariantRecordDataTypesType)theEObject;
				T result = caseVariantRecordDataTypesType(variantRecordDataTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.VARIANT_RECORD_ENCODING_TYPE: {
				VariantRecordEncodingType variantRecordEncodingType = (VariantRecordEncodingType)theEObject;
				T result = caseVariantRecordEncodingType(variantRecordEncodingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.UNCONDITIONAL_ATTRIBUTE_OWNERSHIP_DIVESTITURE_TYPE: {
				UnconditionalAttributeOwnershipDivestitureType unconditionalAttributeOwnershipDivestitureType = (UnconditionalAttributeOwnershipDivestitureType)theEObject;
				T result = caseUnconditionalAttributeOwnershipDivestitureType(unconditionalAttributeOwnershipDivestitureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.UNPUBLISH_INTERACTION_CLASS_TYPE: {
				UnpublishInteractionClassType unpublishInteractionClassType = (UnpublishInteractionClassType)theEObject;
				T result = caseUnpublishInteractionClassType(unpublishInteractionClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.UNPUBLISH_OBJECT_CLASS_ATTRIBUTES_TYPE: {
				UnpublishObjectClassAttributesType unpublishObjectClassAttributesType = (UnpublishObjectClassAttributesType)theEObject;
				T result = caseUnpublishObjectClassAttributesType(unpublishObjectClassAttributesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.UNSUBSCRIBE_INTERACTION_CLASS_TYPE: {
				UnsubscribeInteractionClassType unsubscribeInteractionClassType = (UnsubscribeInteractionClassType)theEObject;
				T result = caseUnsubscribeInteractionClassType(unsubscribeInteractionClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.UNSUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS_TYPE: {
				UnsubscribeInteractionClassWithRegionsType unsubscribeInteractionClassWithRegionsType = (UnsubscribeInteractionClassWithRegionsType)theEObject;
				T result = caseUnsubscribeInteractionClassWithRegionsType(unsubscribeInteractionClassWithRegionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_TYPE: {
				UnsubscribeObjectClassAttributesType unsubscribeObjectClassAttributesType = (UnsubscribeObjectClassAttributesType)theEObject;
				T result = caseUnsubscribeObjectClassAttributesType(unsubscribeObjectClassAttributesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS_TYPE: {
				UnsubscribeObjectClassAttributesWithRegionsType unsubscribeObjectClassAttributesWithRegionsType = (UnsubscribeObjectClassAttributesWithRegionsType)theEObject;
				T result = caseUnsubscribeObjectClassAttributesWithRegionsType(unsubscribeObjectClassAttributesWithRegionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.UPDATE_ATTRIBUTE_VALUES_TYPE: {
				UpdateAttributeValuesType updateAttributeValuesType = (UpdateAttributeValuesType)theEObject;
				T result = caseUpdateAttributeValuesType(updateAttributeValuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.TIME_STAMP_TYPE: {
				TimeStampType timeStampType = (TimeStampType)theEObject;
				T result = caseTimeStampType(timeStampType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.TIME_TYPE: {
				TimeType timeType = (TimeType)theEObject;
				T result = caseTimeType(timeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.TRANSPORTATIONS_TYPE: {
				TransportationsType transportationsType = (TransportationsType)theEObject;
				T result = caseTransportationsType(transportationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.TRANSPORTATION_TYPE: {
				TransportationType transportationType = (TransportationType)theEObject;
				T result = caseTransportationType(transportationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.TRANSPORTATION_TYPE1: {
				TransportationType1 transportationType1 = (TransportationType1)theEObject;
				T result = caseTransportationType1(transportationType1);
				if (result == null) result = caseTransportationType(transportationType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.TURN_INTERACTIONS_OFF_TYPE: {
				TurnInteractionsOffType turnInteractionsOffType = (TurnInteractionsOffType)theEObject;
				T result = caseTurnInteractionsOffType(turnInteractionsOffType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.TURN_INTERACTIONS_ON_TYPE: {
				TurnInteractionsOnType turnInteractionsOnType = (TurnInteractionsOnType)theEObject;
				T result = caseTurnInteractionsOnType(turnInteractionsOnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.TURN_UPDATES_OFF_FOR_OBJECT_INSTANCE_TYPE: {
				TurnUpdatesOffForObjectInstanceType turnUpdatesOffForObjectInstanceType = (TurnUpdatesOffForObjectInstanceType)theEObject;
				T result = caseTurnUpdatesOffForObjectInstanceType(turnUpdatesOffForObjectInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.TURN_UPDATES_ON_FOR_OBJECT_INSTANCE_TYPE: {
				TurnUpdatesOnForObjectInstanceType turnUpdatesOnForObjectInstanceType = (TurnUpdatesOnForObjectInstanceType)theEObject;
				T result = caseTurnUpdatesOnForObjectInstanceType(turnUpdatesOnForObjectInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.TYPE_TYPE: {
				TypeType typeType = (TypeType)theEObject;
				T result = caseTypeType(typeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.UNASSOCIATE_REGIONS_FOR_UPDATES_TYPE: {
				UnassociateRegionsForUpdatesType unassociateRegionsForUpdatesType = (UnassociateRegionsForUpdatesType)theEObject;
				T result = caseUnassociateRegionsForUpdatesType(unassociateRegionsForUpdatesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.SWITCH_TYPE: {
				SwitchType switchType = (SwitchType)theEObject;
				T result = caseSwitchType(switchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.SYNCHRONIZATION_POINT_ACHIEVED_TYPE: {
				SynchronizationPointAchievedType synchronizationPointAchievedType = (SynchronizationPointAchievedType)theEObject;
				T result = caseSynchronizationPointAchievedType(synchronizationPointAchievedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.SYNCHRONIZATION_POINT_TYPE: {
				SynchronizationPointType synchronizationPointType = (SynchronizationPointType)theEObject;
				T result = caseSynchronizationPointType(synchronizationPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.SYNCHRONIZATION_POINT_TYPE1: {
				SynchronizationPointType1 synchronizationPointType1 = (SynchronizationPointType1)theEObject;
				T result = caseSynchronizationPointType1(synchronizationPointType1);
				if (result == null) result = caseSynchronizationPointType(synchronizationPointType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.SYNCHRONIZATIONS_TYPE: {
				SynchronizationsType synchronizationsType = (SynchronizationsType)theEObject;
				T result = caseSynchronizationsType(synchronizationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.TAGS_TYPE: {
				TagsType tagsType = (TagsType)theEObject;
				T result = caseTagsType(tagsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.TAG_TYPE: {
				TagType tagType = (TagType)theEObject;
				T result = caseTagType(tagType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.TIME_ADVANCE_GRANT_TYPE: {
				TimeAdvanceGrantType timeAdvanceGrantType = (TimeAdvanceGrantType)theEObject;
				T result = caseTimeAdvanceGrantType(timeAdvanceGrantType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.TIME_ADVANCE_REQUEST_AVAILABLE_TYPE: {
				TimeAdvanceRequestAvailableType timeAdvanceRequestAvailableType = (TimeAdvanceRequestAvailableType)theEObject;
				T result = caseTimeAdvanceRequestAvailableType(timeAdvanceRequestAvailableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.TIME_ADVANCE_REQUEST_TYPE: {
				TimeAdvanceRequestType timeAdvanceRequestType = (TimeAdvanceRequestType)theEObject;
				T result = caseTimeAdvanceRequestType(timeAdvanceRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.TIME_CONSTRAINED_ENABLED_TYPE: {
				TimeConstrainedEnabledType timeConstrainedEnabledType = (TimeConstrainedEnabledType)theEObject;
				T result = caseTimeConstrainedEnabledType(timeConstrainedEnabledType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.TIME_REGULATION_ENABLED_TYPE: {
				TimeRegulationEnabledType timeRegulationEnabledType = (TimeRegulationEnabledType)theEObject;
				T result = caseTimeRegulationEnabledType(timeRegulationEnabledType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.SHARING_TYPE: {
				SharingType sharingType = (SharingType)theEObject;
				T result = caseSharingType(sharingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.SIMPLE_DATA_TYPE: {
				SimpleDataType simpleDataType = (SimpleDataType)theEObject;
				T result = caseSimpleDataType(simpleDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.SIMPLE_DATA_TYPE1: {
				SimpleDataType1 simpleDataType1 = (SimpleDataType1)theEObject;
				T result = caseSimpleDataType1(simpleDataType1);
				if (result == null) result = caseSimpleDataType(simpleDataType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.SIMPLE_DATA_TYPES_TYPE: {
				SimpleDataTypesType simpleDataTypesType = (SimpleDataTypesType)theEObject;
				T result = caseSimpleDataTypesType(simpleDataTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.SIZE: {
				Size size = (Size)theEObject;
				T result = caseSize(size);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.START_REGISTRATION_FOR_OBJECT_CLASS_TYPE: {
				StartRegistrationForObjectClassType startRegistrationForObjectClassType = (StartRegistrationForObjectClassType)theEObject;
				T result = caseStartRegistrationForObjectClassType(startRegistrationForObjectClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.STOP_REGISTRATION_FOR_OBJECT_CLASS_TYPE: {
				StopRegistrationForObjectClassType stopRegistrationForObjectClassType = (StopRegistrationForObjectClassType)theEObject;
				T result = caseStopRegistrationForObjectClassType(stopRegistrationForObjectClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.STRING: {
				edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String string = (edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String)theEObject;
				T result = caseString(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.SUBSCRIBE_INTERACTION_CLASS_TYPE: {
				SubscribeInteractionClassType subscribeInteractionClassType = (SubscribeInteractionClassType)theEObject;
				T result = caseSubscribeInteractionClassType(subscribeInteractionClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.SUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS_TYPE: {
				SubscribeInteractionClassWithRegionsType subscribeInteractionClassWithRegionsType = (SubscribeInteractionClassWithRegionsType)theEObject;
				T result = caseSubscribeInteractionClassWithRegionsType(subscribeInteractionClassWithRegionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_TYPE: {
				SubscribeObjectClassAttributesType subscribeObjectClassAttributesType = (SubscribeObjectClassAttributesType)theEObject;
				T result = caseSubscribeObjectClassAttributesType(subscribeObjectClassAttributesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS_TYPE: {
				SubscribeObjectClassAttributesWithRegionsType subscribeObjectClassAttributesWithRegionsType = (SubscribeObjectClassAttributesWithRegionsType)theEObject;
				T result = caseSubscribeObjectClassAttributesWithRegionsType(subscribeObjectClassAttributesWithRegionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.SWITCHES_TYPE: {
				SwitchesType switchesType = (SwitchesType)theEObject;
				T result = caseSwitchesType(switchesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.RESERVE_OBJECT_INSTANCE_NAME_TYPE: {
				ReserveObjectInstanceNameType reserveObjectInstanceNameType = (ReserveObjectInstanceNameType)theEObject;
				T result = caseReserveObjectInstanceNameType(reserveObjectInstanceNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.RESIGN_FEDERATION_EXECUTION_TYPE: {
				ResignFederationExecutionType resignFederationExecutionType = (ResignFederationExecutionType)theEObject;
				T result = caseResignFederationExecutionType(resignFederationExecutionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.RESIGN_SWITCH_TYPE: {
				ResignSwitchType resignSwitchType = (ResignSwitchType)theEObject;
				T result = caseResignSwitchType(resignSwitchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.RETRACT_TYPE: {
				RetractType retractType = (RetractType)theEObject;
				T result = caseRetractType(retractType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.SECURITY_CLASSIFICATION_TYPE: {
				SecurityClassificationType securityClassificationType = (SecurityClassificationType)theEObject;
				T result = caseSecurityClassificationType(securityClassificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.SEND_INTERACTION_TYPE: {
				SendInteractionType sendInteractionType = (SendInteractionType)theEObject;
				T result = caseSendInteractionType(sendInteractionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.SEND_INTERACTION_WITH_REGIONS_TYPE: {
				SendInteractionWithRegionsType sendInteractionWithRegionsType = (SendInteractionWithRegionsType)theEObject;
				T result = caseSendInteractionWithRegionsType(sendInteractionWithRegionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.SERVICE_UTILIZATION_TYPE: {
				ServiceUtilizationType serviceUtilizationType = (ServiceUtilizationType)theEObject;
				T result = caseServiceUtilizationType(serviceUtilizationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.SET_AUTOMATIC_RESIGN_DIRECTIVE_TYPE: {
				SetAutomaticResignDirectiveType setAutomaticResignDirectiveType = (SetAutomaticResignDirectiveType)theEObject;
				T result = caseSetAutomaticResignDirectiveType(setAutomaticResignDirectiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.SET_RANGE_BOUNDS_TYPE: {
				SetRangeBoundsType setRangeBoundsType = (SetRangeBoundsType)theEObject;
				T result = caseSetRangeBoundsType(setRangeBoundsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.RELIABLE_TYPE: {
				ReliableType reliableType = (ReliableType)theEObject;
				T result = caseReliableType(reliableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.REMOVEOBJECTINSTANCE_TYPE: {
				RemoveobjectinstanceType removeobjectinstanceType = (RemoveobjectinstanceType)theEObject;
				T result = caseRemoveobjectinstanceType(removeobjectinstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.REPORT_ATTRIBUTE_TRANSPORTATION_TYPE_TYPE: {
				ReportAttributeTransportationTypeType reportAttributeTransportationTypeType = (ReportAttributeTransportationTypeType)theEObject;
				T result = caseReportAttributeTransportationTypeType(reportAttributeTransportationTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.REPORT_FEDERATION_EXECUTIONS_TYPE: {
				ReportFederationExecutionsType reportFederationExecutionsType = (ReportFederationExecutionsType)theEObject;
				T result = caseReportFederationExecutionsType(reportFederationExecutionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.REPORT_INTERACTION_TRANSPORTATION_TYPE_TYPE: {
				ReportInteractionTransportationTypeType reportInteractionTransportationTypeType = (ReportInteractionTransportationTypeType)theEObject;
				T result = caseReportInteractionTransportationTypeType(reportInteractionTransportationTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.REQUEST_ATTRIBUTE_OWNERSHIP_ASSUMPTION_TYPE: {
				RequestAttributeOwnershipAssumptionType requestAttributeOwnershipAssumptionType = (RequestAttributeOwnershipAssumptionType)theEObject;
				T result = caseRequestAttributeOwnershipAssumptionType(requestAttributeOwnershipAssumptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.REQUEST_ATTRIBUTE_OWNERSHIP_RELEASE_TYPE: {
				RequestAttributeOwnershipReleaseType requestAttributeOwnershipReleaseType = (RequestAttributeOwnershipReleaseType)theEObject;
				T result = caseRequestAttributeOwnershipReleaseType(requestAttributeOwnershipReleaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.REQUEST_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE_TYPE: {
				RequestAttributeTransportationTypeChangeType requestAttributeTransportationTypeChangeType = (RequestAttributeTransportationTypeChangeType)theEObject;
				T result = caseRequestAttributeTransportationTypeChangeType(requestAttributeTransportationTypeChangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.REQUEST_ATTRIBUTE_VALUE_UPDATE_TYPE: {
				RequestAttributeValueUpdateType requestAttributeValueUpdateType = (RequestAttributeValueUpdateType)theEObject;
				T result = caseRequestAttributeValueUpdateType(requestAttributeValueUpdateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.REQUEST_ATTRIBUTE_VALUE_UPDATE_WITH_REGIONS_TYPE: {
				RequestAttributeValueUpdateWithRegionsType requestAttributeValueUpdateWithRegionsType = (RequestAttributeValueUpdateWithRegionsType)theEObject;
				T result = caseRequestAttributeValueUpdateWithRegionsType(requestAttributeValueUpdateWithRegionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.REQUEST_DIVESTITURE_CONFIRMATION_TYPE: {
				RequestDivestitureConfirmationType requestDivestitureConfirmationType = (RequestDivestitureConfirmationType)theEObject;
				T result = caseRequestDivestitureConfirmationType(requestDivestitureConfirmationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.REQUEST_FEDERATION_RESTORE_TYPE: {
				RequestFederationRestoreType requestFederationRestoreType = (RequestFederationRestoreType)theEObject;
				T result = caseRequestFederationRestoreType(requestFederationRestoreType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.REQUEST_FEDERATION_SAVE_TYPE: {
				RequestFederationSaveType requestFederationSaveType = (RequestFederationSaveType)theEObject;
				T result = caseRequestFederationSaveType(requestFederationSaveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.REQUEST_INTERACTION_TRANSPORTATION_TYPE_CHANGE_TYPE: {
				RequestInteractionTransportationTypeChangeType requestInteractionTransportationTypeChangeType = (RequestInteractionTransportationTypeChangeType)theEObject;
				T result = caseRequestInteractionTransportationTypeChangeType(requestInteractionTransportationTypeChangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.REQUEST_RETRACTION_TYPE: {
				RequestRetractionType requestRetractionType = (RequestRetractionType)theEObject;
				T result = caseRequestRetractionType(requestRetractionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.RESERVE_MULTIPLE_OBJECT_INSTANCE_NAMES_TYPE: {
				ReserveMultipleObjectInstanceNamesType reserveMultipleObjectInstanceNamesType = (ReserveMultipleObjectInstanceNamesType)theEObject;
				T result = caseReserveMultipleObjectInstanceNamesType(reserveMultipleObjectInstanceNamesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.POC_TYPE_TYPE: {
				PocTypeType pocTypeType = (PocTypeType)theEObject;
				T result = casePocTypeType(pocTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.PROVIDE_ATTRIBUTE_VALUE_UPDATE_TYPE: {
				ProvideAttributeValueUpdateType provideAttributeValueUpdateType = (ProvideAttributeValueUpdateType)theEObject;
				T result = caseProvideAttributeValueUpdateType(provideAttributeValueUpdateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.PUBLISH_INTERACTION_CLASS_TYPE: {
				PublishInteractionClassType publishInteractionClassType = (PublishInteractionClassType)theEObject;
				T result = casePublishInteractionClassType(publishInteractionClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.PUBLISH_OBJECT_CLASS_ATTRIBUTES_TYPE: {
				PublishObjectClassAttributesType publishObjectClassAttributesType = (PublishObjectClassAttributesType)theEObject;
				T result = casePublishObjectClassAttributesType(publishObjectClassAttributesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.QUERY_ATTRIBUTE_OWNERSHIP_TYPE: {
				QueryAttributeOwnershipType queryAttributeOwnershipType = (QueryAttributeOwnershipType)theEObject;
				T result = caseQueryAttributeOwnershipType(queryAttributeOwnershipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.QUERY_ATTRIBUTE_TRANSPORTATION_TYPE_TYPE: {
				QueryAttributeTransportationTypeType queryAttributeTransportationTypeType = (QueryAttributeTransportationTypeType)theEObject;
				T result = caseQueryAttributeTransportationTypeType(queryAttributeTransportationTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.QUERY_FEDERATION_RESTORE_STATUS_TYPE: {
				QueryFederationRestoreStatusType queryFederationRestoreStatusType = (QueryFederationRestoreStatusType)theEObject;
				T result = caseQueryFederationRestoreStatusType(queryFederationRestoreStatusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.QUERY_FEDERATION_SAVE_STATUS_TYPE: {
				QueryFederationSaveStatusType queryFederationSaveStatusType = (QueryFederationSaveStatusType)theEObject;
				T result = caseQueryFederationSaveStatusType(queryFederationSaveStatusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.QUERY_GALT_TYPE: {
				QueryGALTType queryGALTType = (QueryGALTType)theEObject;
				T result = caseQueryGALTType(queryGALTType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.QUERY_INTERACTION_TRANSPORTATION_TYPE_TYPE: {
				QueryInteractionTransportationTypeType queryInteractionTransportationTypeType = (QueryInteractionTransportationTypeType)theEObject;
				T result = caseQueryInteractionTransportationTypeType(queryInteractionTransportationTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.QUERY_LITS_TYPE: {
				QueryLITSType queryLITSType = (QueryLITSType)theEObject;
				T result = caseQueryLITSType(queryLITSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.QUERY_LOGICAL_TIME_TYPE: {
				QueryLogicalTimeType queryLogicalTimeType = (QueryLogicalTimeType)theEObject;
				T result = caseQueryLogicalTimeType(queryLogicalTimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.QUERY_LOOKAHEAD_TYPE: {
				QueryLookaheadType queryLookaheadType = (QueryLookaheadType)theEObject;
				T result = caseQueryLookaheadType(queryLookaheadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.RATE_TYPE: {
				RateType rateType = (RateType)theEObject;
				T result = caseRateType(rateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.RECEIVE_INTERACTION_TYPE: {
				ReceiveInteractionType receiveInteractionType = (ReceiveInteractionType)theEObject;
				T result = caseReceiveInteractionType(receiveInteractionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.REFERENCE_TYPE: {
				ReferenceType referenceType = (ReferenceType)theEObject;
				T result = caseReferenceType(referenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.REFLECT_ATTRIBUTE_VALUES_TYPE: {
				ReflectAttributeValuesType reflectAttributeValuesType = (ReflectAttributeValuesType)theEObject;
				T result = caseReflectAttributeValuesType(reflectAttributeValuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.REGISTER_FEDERATION_SYNCHRONIZATION_POINT_TYPE: {
				RegisterFederationSynchronizationPointType registerFederationSynchronizationPointType = (RegisterFederationSynchronizationPointType)theEObject;
				T result = caseRegisterFederationSynchronizationPointType(registerFederationSynchronizationPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.REGISTER_OBJECT_INSTANCE_TYPE: {
				RegisterObjectInstanceType registerObjectInstanceType = (RegisterObjectInstanceType)theEObject;
				T result = caseRegisterObjectInstanceType(registerObjectInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.REGISTER_OBJECT_INSTANCE_WITH_REGIONS_TYPE: {
				RegisterObjectInstanceWithRegionsType registerObjectInstanceWithRegionsType = (RegisterObjectInstanceWithRegionsType)theEObject;
				T result = caseRegisterObjectInstanceWithRegionsType(registerObjectInstanceWithRegionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.RELEASE_MULTIPLE_OBJECT_INSTANCE_NAMES_TYPE: {
				ReleaseMultipleObjectInstanceNamesType releaseMultipleObjectInstanceNamesType = (ReleaseMultipleObjectInstanceNamesType)theEObject;
				T result = caseReleaseMultipleObjectInstanceNamesType(releaseMultipleObjectInstanceNamesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.RELEASE_OBJECT_INSTANCE_NAME_TYPE: {
				ReleaseObjectInstanceNameType releaseObjectInstanceNameType = (ReleaseObjectInstanceNameType)theEObject;
				T result = caseReleaseObjectInstanceNameType(releaseObjectInstanceNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.NEXT_MESSAGE_REQUEST_TYPE: {
				NextMessageRequestType nextMessageRequestType = (NextMessageRequestType)theEObject;
				T result = caseNextMessageRequestType(nextMessageRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.NON_EMPTY_STRING1: {
				NonEmptyString1 nonEmptyString1 = (NonEmptyString1)theEObject;
				T result = caseNonEmptyString1(nonEmptyString1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.NORMALIZE_FEDERATE_HANDLE_TYPE: {
				NormalizeFederateHandleType normalizeFederateHandleType = (NormalizeFederateHandleType)theEObject;
				T result = caseNormalizeFederateHandleType(normalizeFederateHandleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.NORMALIZE_SERVICE_GROUP_TYPE: {
				NormalizeServiceGroupType normalizeServiceGroupType = (NormalizeServiceGroupType)theEObject;
				T result = caseNormalizeServiceGroupType(normalizeServiceGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.NOTES_TYPE: {
				NotesType notesType = (NotesType)theEObject;
				T result = caseNotesType(notesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.NOTE_TYPE: {
				NoteType noteType = (NoteType)theEObject;
				T result = caseNoteType(noteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.OBJECT_CLASS_TYPE: {
				ObjectClassType objectClassType = (ObjectClassType)theEObject;
				T result = caseObjectClassType(objectClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.OBJECT_CLASS_TYPE1: {
				ObjectClassType1 objectClassType1 = (ObjectClassType1)theEObject;
				T result = caseObjectClassType1(objectClassType1);
				if (result == null) result = caseObjectClassType(objectClassType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.OBJECT_INSTANCE_NAME_RESERVED_TYPE: {
				ObjectInstanceNameReservedType objectInstanceNameReservedType = (ObjectInstanceNameReservedType)theEObject;
				T result = caseObjectInstanceNameReservedType(objectInstanceNameReservedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.OBJECT_MODEL_TYPE: {
				ObjectModelType objectModelType = (ObjectModelType)theEObject;
				T result = caseObjectModelType(objectModelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.OBJECTS_TYPE: {
				ObjectsType objectsType = (ObjectsType)theEObject;
				T result = caseObjectsType(objectsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ORDER_TYPE: {
				OrderType orderType = (OrderType)theEObject;
				T result = caseOrderType(orderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.OWNERSHIP_TYPE: {
				OwnershipType ownershipType = (OwnershipType)theEObject;
				T result = caseOwnershipType(ownershipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.PARAMETER_TYPE: {
				ParameterType parameterType = (ParameterType)theEObject;
				T result = caseParameterType(parameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.PARAMETER_TYPE1: {
				ParameterType1 parameterType1 = (ParameterType1)theEObject;
				T result = caseParameterType1(parameterType1);
				if (result == null) result = caseParameterType(parameterType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.POC_TYPE: {
				PocType pocType = (PocType)theEObject;
				T result = casePocType(pocType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.POC_TYPE1: {
				PocType1 pocType1 = (PocType1)theEObject;
				T result = casePocType1(pocType1);
				if (result == null) result = casePocType(pocType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_OBJECT_INSTANCE_HANDLE_TYPE: {
				GetObjectInstanceHandleType getObjectInstanceHandleType = (GetObjectInstanceHandleType)theEObject;
				T result = caseGetObjectInstanceHandleType(getObjectInstanceHandleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_OBJECT_INSTANCE_NAME_TYPE: {
				GetObjectInstanceNameType getObjectInstanceNameType = (GetObjectInstanceNameType)theEObject;
				T result = caseGetObjectInstanceNameType(getObjectInstanceNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_ORDER_NAME_TYPE: {
				GetOrderNameType getOrderNameType = (GetOrderNameType)theEObject;
				T result = caseGetOrderNameType(getOrderNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_ORDER_TYPE_TYPE: {
				GetOrderTypeType getOrderTypeType = (GetOrderTypeType)theEObject;
				T result = caseGetOrderTypeType(getOrderTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_PARAMETER_HANDLE_TYPE: {
				GetParameterHandleType getParameterHandleType = (GetParameterHandleType)theEObject;
				T result = caseGetParameterHandleType(getParameterHandleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_PARAMETER_NAME_TYPE: {
				GetParameterNameType getParameterNameType = (GetParameterNameType)theEObject;
				T result = caseGetParameterNameType(getParameterNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_RANGE_BOUNDS_TYPE: {
				GetRangeBoundsType getRangeBoundsType = (GetRangeBoundsType)theEObject;
				T result = caseGetRangeBoundsType(getRangeBoundsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_TRANSPORTATION_TYPE_HANDLE_TYPE: {
				GetTransportationTypeHandleType getTransportationTypeHandleType = (GetTransportationTypeHandleType)theEObject;
				T result = caseGetTransportationTypeHandleType(getTransportationTypeHandleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_TRANSPORTATION_TYPE_NAME_TYPE: {
				GetTransportationTypeNameType getTransportationTypeNameType = (GetTransportationTypeNameType)theEObject;
				T result = caseGetTransportationTypeNameType(getTransportationTypeNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_UPDATE_RATE_VALUE_FOR_ATTRIBUTE_TYPE: {
				GetUpdateRateValueForAttributeType getUpdateRateValueForAttributeType = (GetUpdateRateValueForAttributeType)theEObject;
				T result = caseGetUpdateRateValueForAttributeType(getUpdateRateValueForAttributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_UPDATE_RATE_VALUE_TYPE: {
				GetUpdateRateValueType getUpdateRateValueType = (GetUpdateRateValueType)theEObject;
				T result = caseGetUpdateRateValueType(getUpdateRateValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GLYPH_TYPE: {
				GlyphType glyphType = (GlyphType)theEObject;
				T result = caseGlyphType(glyphType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GLYPH_TYPE1: {
				GlyphType1 glyphType1 = (GlyphType1)theEObject;
				T result = caseGlyphType1(glyphType1);
				if (result == null) result = caseGlyphType(glyphType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.IDENTIFICATION_TYPE: {
				IdentificationType identificationType = (IdentificationType)theEObject;
				T result = caseIdentificationType(identificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.IDENTIFIER_TYPE: {
				IdentifierType identifierType = (IdentifierType)theEObject;
				T result = caseIdentifierType(identifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ID_REFERENCE_TYPE: {
				IdReferenceType idReferenceType = (IdReferenceType)theEObject;
				T result = caseIdReferenceType(idReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.INFORM_ATTRIBUTE_OWNERSHIP_TYPE: {
				InformAttributeOwnershipType informAttributeOwnershipType = (InformAttributeOwnershipType)theEObject;
				T result = caseInformAttributeOwnershipType(informAttributeOwnershipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.INITIATE_FEDERATE_RESTORE_TYPE: {
				InitiateFederateRestoreType initiateFederateRestoreType = (InitiateFederateRestoreType)theEObject;
				T result = caseInitiateFederateRestoreType(initiateFederateRestoreType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.INITIATE_FEDERATE_SAVE_TYPE: {
				InitiateFederateSaveType initiateFederateSaveType = (InitiateFederateSaveType)theEObject;
				T result = caseInitiateFederateSaveType(initiateFederateSaveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.INTERACTION_CLASS_TYPE: {
				InteractionClassType interactionClassType = (InteractionClassType)theEObject;
				T result = caseInteractionClassType(interactionClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.INTERACTION_CLASS_TYPE1: {
				InteractionClassType1 interactionClassType1 = (InteractionClassType1)theEObject;
				T result = caseInteractionClassType1(interactionClassType1);
				if (result == null) result = caseInteractionClassType(interactionClassType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.INTERACTIONS_TYPE: {
				InteractionsType interactionsType = (InteractionsType)theEObject;
				T result = caseInteractionsType(interactionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.IS_ATTRIBUTE_OWNED_BY_FEDERATE_TYPE: {
				IsAttributeOwnedByFederateType isAttributeOwnedByFederateType = (IsAttributeOwnedByFederateType)theEObject;
				T result = caseIsAttributeOwnedByFederateType(isAttributeOwnedByFederateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.JOIN_FEDERATION_EXECUTION_TYPE: {
				JoinFederationExecutionType joinFederationExecutionType = (JoinFederationExecutionType)theEObject;
				T result = caseJoinFederationExecutionType(joinFederationExecutionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.KEYWORD_TYPE: {
				KeywordType keywordType = (KeywordType)theEObject;
				T result = caseKeywordType(keywordType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.LIST_FEDERATION_EXECUTIONS_TYPE: {
				ListFederationExecutionsType listFederationExecutionsType = (ListFederationExecutionsType)theEObject;
				T result = caseListFederationExecutionsType(listFederationExecutionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.LOCAL_DELETE_OBJECT_INSTANCE_TYPE: {
				LocalDeleteObjectInstanceType localDeleteObjectInstanceType = (LocalDeleteObjectInstanceType)theEObject;
				T result = caseLocalDeleteObjectInstanceType(localDeleteObjectInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.LOOKAHEAD_TYPE: {
				LookaheadType lookaheadType = (LookaheadType)theEObject;
				T result = caseLookaheadType(lookaheadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.MODEL_IDENTIFICATION_TYPE: {
				ModelIdentificationType modelIdentificationType = (ModelIdentificationType)theEObject;
				T result = caseModelIdentificationType(modelIdentificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.MODEL_TYPE: {
				ModelType modelType = (ModelType)theEObject;
				T result = caseModelType(modelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.MODIFICATION_DATE_TYPE: {
				ModificationDateType modificationDateType = (ModificationDateType)theEObject;
				T result = caseModificationDateType(modificationDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.MODIFY_LOOKAHEAD_TYPE: {
				ModifyLookaheadType modifyLookaheadType = (ModifyLookaheadType)theEObject;
				T result = caseModifyLookaheadType(modifyLookaheadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.MULTIPLE_OBJECT_INSTANCE_NAMES_RESERVED_TYPE: {
				MultipleObjectInstanceNamesReservedType multipleObjectInstanceNamesReservedType = (MultipleObjectInstanceNamesReservedType)theEObject;
				T result = caseMultipleObjectInstanceNamesReservedType(multipleObjectInstanceNamesReservedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE_TYPE: {
				NegotiatedAttributeOwnershipDivestitureType negotiatedAttributeOwnershipDivestitureType = (NegotiatedAttributeOwnershipDivestitureType)theEObject;
				T result = caseNegotiatedAttributeOwnershipDivestitureType(negotiatedAttributeOwnershipDivestitureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.NEXT_MESSAGE_REQUEST_AVAILABLE_TYPE: {
				NextMessageRequestAvailableType nextMessageRequestAvailableType = (NextMessageRequestAvailableType)theEObject;
				T result = caseNextMessageRequestAvailableType(nextMessageRequestAvailableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.CONFIRM_DIVESTITURE_TYPE: {
				ConfirmDivestitureType confirmDivestitureType = (ConfirmDivestitureType)theEObject;
				T result = caseConfirmDivestitureType(confirmDivestitureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.CONFIRM_FEDERATION_RESTORATION_REQUEST_TYPE: {
				ConfirmFederationRestorationRequestType confirmFederationRestorationRequestType = (ConfirmFederationRestorationRequestType)theEObject;
				T result = caseConfirmFederationRestorationRequestType(confirmFederationRestorationRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.CONFIRM_INTERACTION_TRANSPORTATION_TYPE_CHANGE_TYPE: {
				ConfirmInteractionTransportationTypeChangeType confirmInteractionTransportationTypeChangeType = (ConfirmInteractionTransportationTypeChangeType)theEObject;
				T result = caseConfirmInteractionTransportationTypeChangeType(confirmInteractionTransportationTypeChangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.CONFIRM_SYNCHRONIZATION_POINT_REGISTRATION_TYPE: {
				ConfirmSynchronizationPointRegistrationType confirmSynchronizationPointRegistrationType = (ConfirmSynchronizationPointRegistrationType)theEObject;
				T result = caseConfirmSynchronizationPointRegistrationType(confirmSynchronizationPointRegistrationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.CONNECTION_LOST_TYPE: {
				ConnectionLostType connectionLostType = (ConnectionLostType)theEObject;
				T result = caseConnectionLostType(connectionLostType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.CONNECT_TYPE: {
				ConnectType connectType = (ConnectType)theEObject;
				T result = caseConnectType(connectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.CREATE_FEDERATION_EXECUTION_TYPE: {
				CreateFederationExecutionType createFederationExecutionType = (CreateFederationExecutionType)theEObject;
				T result = caseCreateFederationExecutionType(createFederationExecutionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.CREATE_REGION_TYPE: {
				CreateRegionType createRegionType = (CreateRegionType)theEObject;
				T result = caseCreateRegionType(createRegionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.DATA_TYPES_TYPE: {
				DataTypesType dataTypesType = (DataTypesType)theEObject;
				T result = caseDataTypesType(dataTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.DELETE_OBJECT_INSTANCE_TYPE: {
				DeleteObjectInstanceType deleteObjectInstanceType = (DeleteObjectInstanceType)theEObject;
				T result = caseDeleteObjectInstanceType(deleteObjectInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.DELETE_REGION_TYPE: {
				DeleteRegionType deleteRegionType = (DeleteRegionType)theEObject;
				T result = caseDeleteRegionType(deleteRegionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.DESTROY_FEDERATION_EXECUTION_TYPE: {
				DestroyFederationExecutionType destroyFederationExecutionType = (DestroyFederationExecutionType)theEObject;
				T result = caseDestroyFederationExecutionType(destroyFederationExecutionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.DIMENSIONS_TYPE: {
				DimensionsType dimensionsType = (DimensionsType)theEObject;
				T result = caseDimensionsType(dimensionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.DIMENSIONS_TYPE1: {
				DimensionsType1 dimensionsType1 = (DimensionsType1)theEObject;
				T result = caseDimensionsType1(dimensionsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.DIMENSIONS_TYPE2: {
				DimensionsType2 dimensionsType2 = (DimensionsType2)theEObject;
				T result = caseDimensionsType2(dimensionsType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.DIMENSION_TYPE: {
				DimensionType dimensionType = (DimensionType)theEObject;
				T result = caseDimensionType(dimensionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.DIMENSION_TYPE1: {
				DimensionType1 dimensionType1 = (DimensionType1)theEObject;
				T result = caseDimensionType1(dimensionType1);
				if (result == null) result = caseDimensionType(dimensionType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.DISABLE_ASYNCHRONOUS_DELIVERY_TYPE: {
				DisableAsynchronousDeliveryType disableAsynchronousDeliveryType = (DisableAsynchronousDeliveryType)theEObject;
				T result = caseDisableAsynchronousDeliveryType(disableAsynchronousDeliveryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.DISABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH_TYPE: {
				DisableAttributeRelevanceAdvisorySwitchType disableAttributeRelevanceAdvisorySwitchType = (DisableAttributeRelevanceAdvisorySwitchType)theEObject;
				T result = caseDisableAttributeRelevanceAdvisorySwitchType(disableAttributeRelevanceAdvisorySwitchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.DISABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH_TYPE: {
				DisableAttributeScopeAdvisorySwitchType disableAttributeScopeAdvisorySwitchType = (DisableAttributeScopeAdvisorySwitchType)theEObject;
				T result = caseDisableAttributeScopeAdvisorySwitchType(disableAttributeScopeAdvisorySwitchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.DISABLE_CALLBACKS_TYPE: {
				DisableCallbacksType disableCallbacksType = (DisableCallbacksType)theEObject;
				T result = caseDisableCallbacksType(disableCallbacksType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.DISABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH_TYPE: {
				DisableInteractionRelevanceAdvisorySwitchType disableInteractionRelevanceAdvisorySwitchType = (DisableInteractionRelevanceAdvisorySwitchType)theEObject;
				T result = caseDisableInteractionRelevanceAdvisorySwitchType(disableInteractionRelevanceAdvisorySwitchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.DISABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH_TYPE: {
				DisableObjectClassRelevanceAdvisorySwitchType disableObjectClassRelevanceAdvisorySwitchType = (DisableObjectClassRelevanceAdvisorySwitchType)theEObject;
				T result = caseDisableObjectClassRelevanceAdvisorySwitchType(disableObjectClassRelevanceAdvisorySwitchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.DISABLE_TIME_CONSTRAINED_TYPE: {
				DisableTimeConstrainedType disableTimeConstrainedType = (DisableTimeConstrainedType)theEObject;
				T result = caseDisableTimeConstrainedType(disableTimeConstrainedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.DISABLE_TIME_REGULATION_TYPE: {
				DisableTimeRegulationType disableTimeRegulationType = (DisableTimeRegulationType)theEObject;
				T result = caseDisableTimeRegulationType(disableTimeRegulationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.DISCONNECT_TYPE: {
				DisconnectType disconnectType = (DisconnectType)theEObject;
				T result = caseDisconnectType(disconnectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.DISCOVER_OBJECT_INSTANCE_TYPE: {
				DiscoverObjectInstanceType discoverObjectInstanceType = (DiscoverObjectInstanceType)theEObject;
				T result = caseDiscoverObjectInstanceType(discoverObjectInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ENABLE_ASYNCHRONOUS_DELIVERY_TYPE: {
				EnableAsynchronousDeliveryType enableAsynchronousDeliveryType = (EnableAsynchronousDeliveryType)theEObject;
				T result = caseEnableAsynchronousDeliveryType(enableAsynchronousDeliveryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ENABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH_TYPE: {
				EnableAttributeRelevanceAdvisorySwitchType enableAttributeRelevanceAdvisorySwitchType = (EnableAttributeRelevanceAdvisorySwitchType)theEObject;
				T result = caseEnableAttributeRelevanceAdvisorySwitchType(enableAttributeRelevanceAdvisorySwitchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ENABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH_TYPE: {
				EnableAttributeScopeAdvisorySwitchType enableAttributeScopeAdvisorySwitchType = (EnableAttributeScopeAdvisorySwitchType)theEObject;
				T result = caseEnableAttributeScopeAdvisorySwitchType(enableAttributeScopeAdvisorySwitchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ENABLE_CALLBACKS_TYPE: {
				EnableCallbacksType enableCallbacksType = (EnableCallbacksType)theEObject;
				T result = caseEnableCallbacksType(enableCallbacksType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ENABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH_TYPE: {
				EnableInteractionRelevanceAdvisorySwitchType enableInteractionRelevanceAdvisorySwitchType = (EnableInteractionRelevanceAdvisorySwitchType)theEObject;
				T result = caseEnableInteractionRelevanceAdvisorySwitchType(enableInteractionRelevanceAdvisorySwitchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ENABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH_TYPE: {
				EnableObjectClassRelevanceAdvisorySwitchType enableObjectClassRelevanceAdvisorySwitchType = (EnableObjectClassRelevanceAdvisorySwitchType)theEObject;
				T result = caseEnableObjectClassRelevanceAdvisorySwitchType(enableObjectClassRelevanceAdvisorySwitchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ENABLE_TIME_CONSTRAINED_TYPE: {
				EnableTimeConstrainedType enableTimeConstrainedType = (EnableTimeConstrainedType)theEObject;
				T result = caseEnableTimeConstrainedType(enableTimeConstrainedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ENABLE_TIME_REGULATION_TYPE: {
				EnableTimeRegulationType enableTimeRegulationType = (EnableTimeRegulationType)theEObject;
				T result = caseEnableTimeRegulationType(enableTimeRegulationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ENDIAN_TYPE: {
				EndianType endianType = (EndianType)theEObject;
				T result = caseEndianType(endianType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ENUMERATED_DATA_TYPE: {
				EnumeratedDataType enumeratedDataType = (EnumeratedDataType)theEObject;
				T result = caseEnumeratedDataType(enumeratedDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ENUMERATED_DATA_TYPE1: {
				EnumeratedDataType1 enumeratedDataType1 = (EnumeratedDataType1)theEObject;
				T result = caseEnumeratedDataType1(enumeratedDataType1);
				if (result == null) result = caseEnumeratedDataType(enumeratedDataType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ENUMERATED_DATA_TYPES_TYPE: {
				EnumeratedDataTypesType enumeratedDataTypesType = (EnumeratedDataTypesType)theEObject;
				T result = caseEnumeratedDataTypesType(enumeratedDataTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ENUMERATOR_TYPE: {
				EnumeratorType enumeratorType = (EnumeratorType)theEObject;
				T result = caseEnumeratorType(enumeratorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.EVOKE_CALLBACK_TYPE: {
				EvokeCallbackType evokeCallbackType = (EvokeCallbackType)theEObject;
				T result = caseEvokeCallbackType(evokeCallbackType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.EVOKE_MULTIPLE_CALLBACKS_TYPE: {
				EvokeMultipleCallbacksType evokeMultipleCallbacksType = (EvokeMultipleCallbacksType)theEObject;
				T result = caseEvokeMultipleCallbacksType(evokeMultipleCallbacksType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.FEDERATE_RESTORE_COMPLETE_TYPE: {
				FederateRestoreCompleteType federateRestoreCompleteType = (FederateRestoreCompleteType)theEObject;
				T result = caseFederateRestoreCompleteType(federateRestoreCompleteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.FEDERATE_SAVE_BEGUN_TYPE: {
				FederateSaveBegunType federateSaveBegunType = (FederateSaveBegunType)theEObject;
				T result = caseFederateSaveBegunType(federateSaveBegunType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.FEDERATE_SAVE_COMPLETE_TYPE: {
				FederateSaveCompleteType federateSaveCompleteType = (FederateSaveCompleteType)theEObject;
				T result = caseFederateSaveCompleteType(federateSaveCompleteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.FEDERATION_RESTORE_BEGUN_TYPE: {
				FederationRestoreBegunType federationRestoreBegunType = (FederationRestoreBegunType)theEObject;
				T result = caseFederationRestoreBegunType(federationRestoreBegunType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.FEDERATION_RESTORED_TYPE: {
				FederationRestoredType federationRestoredType = (FederationRestoredType)theEObject;
				T result = caseFederationRestoredType(federationRestoredType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.FEDERATION_RESTORE_STATUS_RESPONSE_TYPE: {
				FederationRestoreStatusResponseType federationRestoreStatusResponseType = (FederationRestoreStatusResponseType)theEObject;
				T result = caseFederationRestoreStatusResponseType(federationRestoreStatusResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.FEDERATION_SAVED_TYPE: {
				FederationSavedType federationSavedType = (FederationSavedType)theEObject;
				T result = caseFederationSavedType(federationSavedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.FEDERATION_SAVE_STATUS_RESPONSE_TYPE: {
				FederationSaveStatusResponseType federationSaveStatusResponseType = (FederationSaveStatusResponseType)theEObject;
				T result = caseFederationSaveStatusResponseType(federationSaveStatusResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.FEDERATION_SYNCHRONIZED_TYPE: {
				FederationSynchronizedType federationSynchronizedType = (FederationSynchronizedType)theEObject;
				T result = caseFederationSynchronizedType(federationSynchronizedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.FIELD_TYPE: {
				FieldType fieldType = (FieldType)theEObject;
				T result = caseFieldType(fieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.FIXED_RECORD_DATA_TYPE: {
				FixedRecordDataType fixedRecordDataType = (FixedRecordDataType)theEObject;
				T result = caseFixedRecordDataType(fixedRecordDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.FIXED_RECORD_DATA_TYPE1: {
				FixedRecordDataType1 fixedRecordDataType1 = (FixedRecordDataType1)theEObject;
				T result = caseFixedRecordDataType1(fixedRecordDataType1);
				if (result == null) result = caseFixedRecordDataType(fixedRecordDataType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.FIXED_RECORD_DATA_TYPES_TYPE: {
				FixedRecordDataTypesType fixedRecordDataTypesType = (FixedRecordDataTypesType)theEObject;
				T result = caseFixedRecordDataTypesType(fixedRecordDataTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.FIXED_RECORD_ENCODING_TYPE: {
				FixedRecordEncodingType fixedRecordEncodingType = (FixedRecordEncodingType)theEObject;
				T result = caseFixedRecordEncodingType(fixedRecordEncodingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.FLUSH_QUEUE_REQUEST_TYPE: {
				FlushQueueRequestType flushQueueRequestType = (FlushQueueRequestType)theEObject;
				T result = caseFlushQueueRequestType(flushQueueRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_ATTRIBUTE_HANDLE_TYPE: {
				GetAttributeHandleType getAttributeHandleType = (GetAttributeHandleType)theEObject;
				T result = caseGetAttributeHandleType(getAttributeHandleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_ATTRIBUTE_NAME_TYPE: {
				GetAttributeNameType getAttributeNameType = (GetAttributeNameType)theEObject;
				T result = caseGetAttributeNameType(getAttributeNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_AUTOMATIC_RESIGN_DIRECTIVE_TYPE: {
				GetAutomaticResignDirectiveType getAutomaticResignDirectiveType = (GetAutomaticResignDirectiveType)theEObject;
				T result = caseGetAutomaticResignDirectiveType(getAutomaticResignDirectiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_AVAILABLE_DIMENSIONS_FOR_CLASS_ATTRIBUTE_TYPE: {
				GetAvailableDimensionsForClassAttributeType getAvailableDimensionsForClassAttributeType = (GetAvailableDimensionsForClassAttributeType)theEObject;
				T result = caseGetAvailableDimensionsForClassAttributeType(getAvailableDimensionsForClassAttributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_AVAILABLE_DIMENSIONS_FOR_INTERACTION_CLASS_TYPE: {
				GetAvailableDimensionsForInteractionClassType getAvailableDimensionsForInteractionClassType = (GetAvailableDimensionsForInteractionClassType)theEObject;
				T result = caseGetAvailableDimensionsForInteractionClassType(getAvailableDimensionsForInteractionClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_DIMENSION_HANDLE_SET_TYPE: {
				GetDimensionHandleSetType getDimensionHandleSetType = (GetDimensionHandleSetType)theEObject;
				T result = caseGetDimensionHandleSetType(getDimensionHandleSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_DIMENSION_HANDLE_TYPE: {
				GetDimensionHandleType getDimensionHandleType = (GetDimensionHandleType)theEObject;
				T result = caseGetDimensionHandleType(getDimensionHandleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_DIMENSION_NAME_TYPE: {
				GetDimensionNameType getDimensionNameType = (GetDimensionNameType)theEObject;
				T result = caseGetDimensionNameType(getDimensionNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_DIMENSION_UPPER_BOUND_TYPE: {
				GetDimensionUpperBoundType getDimensionUpperBoundType = (GetDimensionUpperBoundType)theEObject;
				T result = caseGetDimensionUpperBoundType(getDimensionUpperBoundType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_FEDERATE_HANDLE_TYPE: {
				GetFederateHandleType getFederateHandleType = (GetFederateHandleType)theEObject;
				T result = caseGetFederateHandleType(getFederateHandleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_FEDERATE_NAME_TYPE: {
				GetFederateNameType getFederateNameType = (GetFederateNameType)theEObject;
				T result = caseGetFederateNameType(getFederateNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_INTERACTION_CLASS_HANDLE_TYPE: {
				GetInteractionClassHandleType getInteractionClassHandleType = (GetInteractionClassHandleType)theEObject;
				T result = caseGetInteractionClassHandleType(getInteractionClassHandleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_INTERACTION_CLASS_NAME_TYPE: {
				GetInteractionClassNameType getInteractionClassNameType = (GetInteractionClassNameType)theEObject;
				T result = caseGetInteractionClassNameType(getInteractionClassNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_KNOWN_OBJECT_CLASS_HANDLE_TYPE: {
				GetKnownObjectClassHandleType getKnownObjectClassHandleType = (GetKnownObjectClassHandleType)theEObject;
				T result = caseGetKnownObjectClassHandleType(getKnownObjectClassHandleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_OBJECT_CLASS_HANDLE_TYPE: {
				GetObjectClassHandleType getObjectClassHandleType = (GetObjectClassHandleType)theEObject;
				T result = caseGetObjectClassHandleType(getObjectClassHandleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.GET_OBJECT_CLASS_NAME_TYPE: {
				GetObjectClassNameType getObjectClassNameType = (GetObjectClassNameType)theEObject;
				T result = caseGetObjectClassNameType(getObjectClassNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ABORT_FEDERATION_RESTORE_TYPE: {
				AbortFederationRestoreType abortFederationRestoreType = (AbortFederationRestoreType)theEObject;
				T result = caseAbortFederationRestoreType(abortFederationRestoreType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ABORT_FEDERATION_SAVE_TYPE: {
				AbortFederationSaveType abortFederationSaveType = (AbortFederationSaveType)theEObject;
				T result = caseAbortFederationSaveType(abortFederationSaveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ALTERNATIVE_TYPE: {
				AlternativeType alternativeType = (AlternativeType)theEObject;
				T result = caseAlternativeType(alternativeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ANNOUNCE_SYNCHRONIZATION_POINT_TYPE: {
				AnnounceSynchronizationPointType announceSynchronizationPointType = (AnnounceSynchronizationPointType)theEObject;
				T result = caseAnnounceSynchronizationPointType(announceSynchronizationPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.APPLICATION_DOMAIN_TYPE: {
				ApplicationDomainType applicationDomainType = (ApplicationDomainType)theEObject;
				T result = caseApplicationDomainType(applicationDomainType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ARRAY_DATA_TYPE: {
				ArrayDataType arrayDataType = (ArrayDataType)theEObject;
				T result = caseArrayDataType(arrayDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ARRAY_DATA_TYPE1: {
				ArrayDataType1 arrayDataType1 = (ArrayDataType1)theEObject;
				T result = caseArrayDataType1(arrayDataType1);
				if (result == null) result = caseArrayDataType(arrayDataType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ARRAY_DATATYPE_ENCODING_TYPE: {
				ArrayDatatypeEncodingType arrayDatatypeEncodingType = (ArrayDatatypeEncodingType)theEObject;
				T result = caseArrayDatatypeEncodingType(arrayDatatypeEncodingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ARRAY_DATA_TYPES_TYPE: {
				ArrayDataTypesType arrayDataTypesType = (ArrayDataTypesType)theEObject;
				T result = caseArrayDataTypesType(arrayDataTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ARRAY_DATA_TYPES_TYPE1: {
				ArrayDataTypesType1 arrayDataTypesType1 = (ArrayDataTypesType1)theEObject;
				T result = caseArrayDataTypesType1(arrayDataTypesType1);
				if (result == null) result = caseArrayDataTypesType(arrayDataTypesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ASSOCIATE_REGIONS_FOR_UPDATES_TYPE: {
				AssociateRegionsForUpdatesType associateRegionsForUpdatesType = (AssociateRegionsForUpdatesType)theEObject;
				T result = caseAssociateRegionsForUpdatesType(associateRegionsForUpdatesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ATTRIBUTE_OWNERSHIP_ACQUISITION_IF_AVAILABLE_TYPE: {
				AttributeOwnershipAcquisitionIfAvailableType attributeOwnershipAcquisitionIfAvailableType = (AttributeOwnershipAcquisitionIfAvailableType)theEObject;
				T result = caseAttributeOwnershipAcquisitionIfAvailableType(attributeOwnershipAcquisitionIfAvailableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ATTRIBUTE_OWNERSHIP_ACQUISITION_NOTIFICATION_TYPE: {
				AttributeOwnershipAcquisitionNotificationType attributeOwnershipAcquisitionNotificationType = (AttributeOwnershipAcquisitionNotificationType)theEObject;
				T result = caseAttributeOwnershipAcquisitionNotificationType(attributeOwnershipAcquisitionNotificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ATTRIBUTE_OWNERSHIP_ACQUISITION_TYPE: {
				AttributeOwnershipAcquisitionType attributeOwnershipAcquisitionType = (AttributeOwnershipAcquisitionType)theEObject;
				T result = caseAttributeOwnershipAcquisitionType(attributeOwnershipAcquisitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ATTRIBUTE_OWNERSHIP_DIVESTITURE_IF_WANTED_TYPE: {
				AttributeOwnershipDivestitureIfWantedType attributeOwnershipDivestitureIfWantedType = (AttributeOwnershipDivestitureIfWantedType)theEObject;
				T result = caseAttributeOwnershipDivestitureIfWantedType(attributeOwnershipDivestitureIfWantedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ATTRIBUTE_OWNERSHIP_RELEASE_DENIED_TYPE: {
				AttributeOwnershipReleaseDeniedType attributeOwnershipReleaseDeniedType = (AttributeOwnershipReleaseDeniedType)theEObject;
				T result = caseAttributeOwnershipReleaseDeniedType(attributeOwnershipReleaseDeniedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ATTRIBUTE_OWNERSHIP_UNAVAILABLE_TYPE: {
				AttributeOwnershipUnavailableType attributeOwnershipUnavailableType = (AttributeOwnershipUnavailableType)theEObject;
				T result = caseAttributeOwnershipUnavailableType(attributeOwnershipUnavailableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ATTRIBUTES_IN_SCOPE_TYPE: {
				AttributesInScopeType attributesInScopeType = (AttributesInScopeType)theEObject;
				T result = caseAttributesInScopeType(attributesInScopeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ATTRIBUTES_OUT_OF_SCOPE_TYPE: {
				AttributesOutOfScopeType attributesOutOfScopeType = (AttributesOutOfScopeType)theEObject;
				T result = caseAttributesOutOfScopeType(attributesOutOfScopeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ATTRIBUTE_TYPE: {
				AttributeType attributeType = (AttributeType)theEObject;
				T result = caseAttributeType(attributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.ATTRIBUTE_TYPE1: {
				AttributeType1 attributeType1 = (AttributeType1)theEObject;
				T result = caseAttributeType1(attributeType1);
				if (result == null) result = caseAttributeType(attributeType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.BASIC_DATA_REPRESENTATIONS_TYPE: {
				BasicDataRepresentationsType basicDataRepresentationsType = (BasicDataRepresentationsType)theEObject;
				T result = caseBasicDataRepresentationsType(basicDataRepresentationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.BASIC_DATA_TYPE: {
				BasicDataType basicDataType = (BasicDataType)theEObject;
				T result = caseBasicDataType(basicDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.BASIC_DATA_TYPE1: {
				BasicDataType1 basicDataType1 = (BasicDataType1)theEObject;
				T result = caseBasicDataType1(basicDataType1);
				if (result == null) result = caseBasicDataType(basicDataType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.CANCEL_ATTRIBUTE_OWNERSHIP_ACQUISITION_TYPE: {
				CancelAttributeOwnershipAcquisitionType cancelAttributeOwnershipAcquisitionType = (CancelAttributeOwnershipAcquisitionType)theEObject;
				T result = caseCancelAttributeOwnershipAcquisitionType(cancelAttributeOwnershipAcquisitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.CANCEL_NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE_TYPE: {
				CancelNegotiatedAttributeOwnershipDivestitureType cancelNegotiatedAttributeOwnershipDivestitureType = (CancelNegotiatedAttributeOwnershipDivestitureType)theEObject;
				T result = caseCancelNegotiatedAttributeOwnershipDivestitureType(cancelNegotiatedAttributeOwnershipDivestitureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.CAPABILITY_TYPE: {
				CapabilityType capabilityType = (CapabilityType)theEObject;
				T result = caseCapabilityType(capabilityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.CARDINALITY_TYPE: {
				CardinalityType cardinalityType = (CardinalityType)theEObject;
				T result = caseCardinalityType(cardinalityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.CHANGE_ATTRIBUTE_ORDER_TYPE_TYPE: {
				ChangeAttributeOrderTypeType changeAttributeOrderTypeType = (ChangeAttributeOrderTypeType)theEObject;
				T result = caseChangeAttributeOrderTypeType(changeAttributeOrderTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.CHANGE_INTERACTION_ORDER_TYPE_TYPE: {
				ChangeInteractionOrderTypeType changeInteractionOrderTypeType = (ChangeInteractionOrderTypeType)theEObject;
				T result = caseChangeInteractionOrderTypeType(changeInteractionOrderTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.COMMIT_REGION_MODIFICATIONS_TYPE: {
				CommitRegionModificationsType commitRegionModificationsType = (CommitRegionModificationsType)theEObject;
				T result = caseCommitRegionModificationsType(commitRegionModificationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION_TYPE: {
				ConfirmAttributeOwnershipAcquisitionCancellationType confirmAttributeOwnershipAcquisitionCancellationType = (ConfirmAttributeOwnershipAcquisitionCancellationType)theEObject;
				T result = caseConfirmAttributeOwnershipAcquisitionCancellationType(confirmAttributeOwnershipAcquisitionCancellationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OmtPackage.CONFIRM_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE_TYPE: {
				ConfirmAttributeTransportationTypeChangeType confirmAttributeTransportationTypeChangeType = (ConfirmAttributeTransportationTypeChangeType)theEObject;
				T result = caseConfirmAttributeTransportationTypeChangeType(confirmAttributeTransportationTypeChangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Rates Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Rates Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateRatesType(UpdateRatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Rate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Rate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateRateType(UpdateRateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateType(UpdateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Upper Bound Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Upper Bound Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpperBoundType(UpperBoundType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant Record Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant Record Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariantRecordDataType(VariantRecordDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant Record Data Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant Record Data Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariantRecordDataType1(VariantRecordDataType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant Record Data Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant Record Data Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariantRecordDataTypesType(VariantRecordDataTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant Record Encoding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant Record Encoding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariantRecordEncodingType(VariantRecordEncodingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unconditional Attribute Ownership Divestiture Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unconditional Attribute Ownership Divestiture Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnconditionalAttributeOwnershipDivestitureType(UnconditionalAttributeOwnershipDivestitureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unpublish Interaction Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unpublish Interaction Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnpublishInteractionClassType(UnpublishInteractionClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unpublish Object Class Attributes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unpublish Object Class Attributes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnpublishObjectClassAttributesType(UnpublishObjectClassAttributesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsubscribe Interaction Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsubscribe Interaction Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsubscribeInteractionClassType(UnsubscribeInteractionClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsubscribe Interaction Class With Regions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsubscribe Interaction Class With Regions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsubscribeInteractionClassWithRegionsType(UnsubscribeInteractionClassWithRegionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsubscribe Object Class Attributes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsubscribe Object Class Attributes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsubscribeObjectClassAttributesType(UnsubscribeObjectClassAttributesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsubscribe Object Class Attributes With Regions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsubscribe Object Class Attributes With Regions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsubscribeObjectClassAttributesWithRegionsType(UnsubscribeObjectClassAttributesWithRegionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Attribute Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Attribute Values Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateAttributeValuesType(UpdateAttributeValuesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Stamp Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Stamp Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeStampType(TimeStampType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeType(TimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transportations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transportations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportationsType(TransportationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transportation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transportation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportationType(TransportationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transportation Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transportation Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportationType1(TransportationType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Interactions Off Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Interactions Off Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnInteractionsOffType(TurnInteractionsOffType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Interactions On Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Interactions On Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnInteractionsOnType(TurnInteractionsOnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Updates Off For Object Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Updates Off For Object Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnUpdatesOffForObjectInstanceType(TurnUpdatesOffForObjectInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Updates On For Object Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Updates On For Object Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnUpdatesOnForObjectInstanceType(TurnUpdatesOnForObjectInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeType(TypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unassociate Regions For Updates Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unassociate Regions For Updates Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnassociateRegionsForUpdatesType(UnassociateRegionsForUpdatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchType(SwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization Point Achieved Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization Point Achieved Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizationPointAchievedType(SynchronizationPointAchievedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizationPointType(SynchronizationPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization Point Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization Point Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizationPointType1(SynchronizationPointType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronizations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronizations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizationsType(SynchronizationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tags Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tags Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagsType(TagsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagType(TagType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Advance Grant Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Advance Grant Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeAdvanceGrantType(TimeAdvanceGrantType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Advance Request Available Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Advance Request Available Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeAdvanceRequestAvailableType(TimeAdvanceRequestAvailableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Advance Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Advance Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeAdvanceRequestType(TimeAdvanceRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Constrained Enabled Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Constrained Enabled Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeConstrainedEnabledType(TimeConstrainedEnabledType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Regulation Enabled Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Regulation Enabled Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeRegulationEnabledType(TimeRegulationEnabledType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sharing Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sharing Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharingType(SharingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleDataType(SimpleDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Data Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Data Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleDataType1(SimpleDataType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Data Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Data Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleDataTypesType(SimpleDataTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSize(Size object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Registration For Object Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Registration For Object Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartRegistrationForObjectClassType(StartRegistrationForObjectClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Registration For Object Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Registration For Object Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopRegistrationForObjectClassType(StopRegistrationForObjectClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscribe Interaction Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscribe Interaction Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscribeInteractionClassType(SubscribeInteractionClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscribe Interaction Class With Regions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscribe Interaction Class With Regions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscribeInteractionClassWithRegionsType(SubscribeInteractionClassWithRegionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscribe Object Class Attributes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscribe Object Class Attributes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscribeObjectClassAttributesType(SubscribeObjectClassAttributesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscribe Object Class Attributes With Regions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscribe Object Class Attributes With Regions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscribeObjectClassAttributesWithRegionsType(SubscribeObjectClassAttributesWithRegionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switches Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switches Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchesType(SwitchesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reserve Object Instance Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reserve Object Instance Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReserveObjectInstanceNameType(ReserveObjectInstanceNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resign Federation Execution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resign Federation Execution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResignFederationExecutionType(ResignFederationExecutionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resign Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resign Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResignSwitchType(ResignSwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetractType(RetractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Classification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Classification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityClassificationType(SecurityClassificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Interaction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Interaction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendInteractionType(SendInteractionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Interaction With Regions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Interaction With Regions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendInteractionWithRegionsType(SendInteractionWithRegionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Utilization Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Utilization Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceUtilizationType(ServiceUtilizationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Automatic Resign Directive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Automatic Resign Directive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetAutomaticResignDirectiveType(SetAutomaticResignDirectiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Range Bounds Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Range Bounds Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetRangeBoundsType(SetRangeBoundsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reliable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reliable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReliableType(ReliableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Removeobjectinstance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Removeobjectinstance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveobjectinstanceType(RemoveobjectinstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report Attribute Transportation Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report Attribute Transportation Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReportAttributeTransportationTypeType(ReportAttributeTransportationTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report Federation Executions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report Federation Executions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReportFederationExecutionsType(ReportFederationExecutionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report Interaction Transportation Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report Interaction Transportation Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReportInteractionTransportationTypeType(ReportInteractionTransportationTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Attribute Ownership Assumption Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Attribute Ownership Assumption Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestAttributeOwnershipAssumptionType(RequestAttributeOwnershipAssumptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Attribute Ownership Release Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Attribute Ownership Release Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestAttributeOwnershipReleaseType(RequestAttributeOwnershipReleaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Attribute Transportation Type Change Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Attribute Transportation Type Change Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestAttributeTransportationTypeChangeType(RequestAttributeTransportationTypeChangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Attribute Value Update Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Attribute Value Update Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestAttributeValueUpdateType(RequestAttributeValueUpdateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Attribute Value Update With Regions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Attribute Value Update With Regions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestAttributeValueUpdateWithRegionsType(RequestAttributeValueUpdateWithRegionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Divestiture Confirmation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Divestiture Confirmation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestDivestitureConfirmationType(RequestDivestitureConfirmationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Federation Restore Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Federation Restore Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestFederationRestoreType(RequestFederationRestoreType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Federation Save Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Federation Save Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestFederationSaveType(RequestFederationSaveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Interaction Transportation Type Change Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Interaction Transportation Type Change Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestInteractionTransportationTypeChangeType(RequestInteractionTransportationTypeChangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Retraction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Retraction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestRetractionType(RequestRetractionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reserve Multiple Object Instance Names Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reserve Multiple Object Instance Names Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReserveMultipleObjectInstanceNamesType(ReserveMultipleObjectInstanceNamesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poc Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poc Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePocTypeType(PocTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provide Attribute Value Update Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provide Attribute Value Update Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvideAttributeValueUpdateType(ProvideAttributeValueUpdateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publish Interaction Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publish Interaction Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublishInteractionClassType(PublishInteractionClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publish Object Class Attributes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publish Object Class Attributes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublishObjectClassAttributesType(PublishObjectClassAttributesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Attribute Ownership Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Attribute Ownership Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryAttributeOwnershipType(QueryAttributeOwnershipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Attribute Transportation Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Attribute Transportation Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryAttributeTransportationTypeType(QueryAttributeTransportationTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Federation Restore Status Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Federation Restore Status Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryFederationRestoreStatusType(QueryFederationRestoreStatusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Federation Save Status Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Federation Save Status Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryFederationSaveStatusType(QueryFederationSaveStatusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query GALT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query GALT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryGALTType(QueryGALTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Interaction Transportation Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Interaction Transportation Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryInteractionTransportationTypeType(QueryInteractionTransportationTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query LITS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query LITS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryLITSType(QueryLITSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Logical Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Logical Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryLogicalTimeType(QueryLogicalTimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Lookahead Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Lookahead Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryLookaheadType(QueryLookaheadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRateType(RateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Interaction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Interaction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveInteractionType(ReceiveInteractionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceType(ReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reflect Attribute Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflect Attribute Values Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReflectAttributeValuesType(ReflectAttributeValuesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Federation Synchronization Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Federation Synchronization Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisterFederationSynchronizationPointType(RegisterFederationSynchronizationPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Object Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Object Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisterObjectInstanceType(RegisterObjectInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Object Instance With Regions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Object Instance With Regions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisterObjectInstanceWithRegionsType(RegisterObjectInstanceWithRegionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release Multiple Object Instance Names Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release Multiple Object Instance Names Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReleaseMultipleObjectInstanceNamesType(ReleaseMultipleObjectInstanceNamesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release Object Instance Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release Object Instance Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReleaseObjectInstanceNameType(ReleaseObjectInstanceNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next Message Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next Message Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNextMessageRequestType(NextMessageRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Empty String1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Empty String1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonEmptyString1(NonEmptyString1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normalize Federate Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normalize Federate Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalizeFederateHandleType(NormalizeFederateHandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normalize Service Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normalize Service Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalizeServiceGroupType(NormalizeServiceGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotesType(NotesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoteType(NoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectClassType(ObjectClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Class Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Class Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectClassType1(ObjectClassType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Instance Name Reserved Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Instance Name Reserved Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectInstanceNameReservedType(ObjectInstanceNameReservedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectModelType(ObjectModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objects Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objects Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectsType(ObjectsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderType(OrderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ownership Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ownership Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwnershipType(OwnershipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterType(ParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterType1(ParameterType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poc Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poc Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePocType(PocType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poc Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poc Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePocType1(PocType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Object Instance Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Object Instance Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetObjectInstanceHandleType(GetObjectInstanceHandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Object Instance Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Object Instance Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetObjectInstanceNameType(GetObjectInstanceNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Order Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Order Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetOrderNameType(GetOrderNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Order Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Order Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetOrderTypeType(GetOrderTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Parameter Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Parameter Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetParameterHandleType(GetParameterHandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Parameter Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Parameter Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetParameterNameType(GetParameterNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Range Bounds Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Range Bounds Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetRangeBoundsType(GetRangeBoundsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Transportation Type Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Transportation Type Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetTransportationTypeHandleType(GetTransportationTypeHandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Transportation Type Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Transportation Type Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetTransportationTypeNameType(GetTransportationTypeNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Update Rate Value For Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Update Rate Value For Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetUpdateRateValueForAttributeType(GetUpdateRateValueForAttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Update Rate Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Update Rate Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetUpdateRateValueType(GetUpdateRateValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glyph Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glyph Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlyphType(GlyphType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glyph Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glyph Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlyphType1(GlyphType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentificationType(IdentificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierType(IdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdReferenceType(IdReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inform Attribute Ownership Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inform Attribute Ownership Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformAttributeOwnershipType(InformAttributeOwnershipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initiate Federate Restore Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initiate Federate Restore Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitiateFederateRestoreType(InitiateFederateRestoreType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initiate Federate Save Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initiate Federate Save Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitiateFederateSaveType(InitiateFederateSaveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionClassType(InteractionClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Class Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Class Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionClassType1(InteractionClassType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interactions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interactions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionsType(InteractionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Attribute Owned By Federate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Attribute Owned By Federate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsAttributeOwnedByFederateType(IsAttributeOwnedByFederateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Federation Execution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Federation Execution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinFederationExecutionType(JoinFederationExecutionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keyword Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keyword Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeywordType(KeywordType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Federation Executions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Federation Executions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListFederationExecutionsType(ListFederationExecutionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Delete Object Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Delete Object Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalDeleteObjectInstanceType(LocalDeleteObjectInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lookahead Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lookahead Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLookaheadType(LookaheadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Identification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Identification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelIdentificationType(ModelIdentificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelType(ModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modification Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modification Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModificationDateType(ModificationDateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Lookahead Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Lookahead Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifyLookaheadType(ModifyLookaheadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Object Instance Names Reserved Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Object Instance Names Reserved Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleObjectInstanceNamesReservedType(MultipleObjectInstanceNamesReservedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negotiated Attribute Ownership Divestiture Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negotiated Attribute Ownership Divestiture Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegotiatedAttributeOwnershipDivestitureType(NegotiatedAttributeOwnershipDivestitureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next Message Request Available Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next Message Request Available Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNextMessageRequestAvailableType(NextMessageRequestAvailableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confirm Divestiture Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confirm Divestiture Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfirmDivestitureType(ConfirmDivestitureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confirm Federation Restoration Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confirm Federation Restoration Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfirmFederationRestorationRequestType(ConfirmFederationRestorationRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confirm Interaction Transportation Type Change Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confirm Interaction Transportation Type Change Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfirmInteractionTransportationTypeChangeType(ConfirmInteractionTransportationTypeChangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confirm Synchronization Point Registration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confirm Synchronization Point Registration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfirmSynchronizationPointRegistrationType(ConfirmSynchronizationPointRegistrationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Lost Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Lost Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionLostType(ConnectionLostType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connect Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connect Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectType(ConnectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Federation Execution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Federation Execution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateFederationExecutionType(CreateFederationExecutionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Region Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Region Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateRegionType(CreateRegionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypesType(DataTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Object Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Object Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteObjectInstanceType(DeleteObjectInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Region Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Region Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteRegionType(DeleteRegionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destroy Federation Execution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destroy Federation Execution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestroyFederationExecutionType(DestroyFederationExecutionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimensions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimensions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionsType(DimensionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimensions Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimensions Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionsType1(DimensionsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimensions Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimensions Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionsType2(DimensionsType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionType(DimensionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionType1(DimensionType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Asynchronous Delivery Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Asynchronous Delivery Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisableAsynchronousDeliveryType(DisableAsynchronousDeliveryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Attribute Relevance Advisory Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Attribute Relevance Advisory Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisableAttributeRelevanceAdvisorySwitchType(DisableAttributeRelevanceAdvisorySwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Attribute Scope Advisory Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Attribute Scope Advisory Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisableAttributeScopeAdvisorySwitchType(DisableAttributeScopeAdvisorySwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Callbacks Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Callbacks Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisableCallbacksType(DisableCallbacksType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Interaction Relevance Advisory Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Interaction Relevance Advisory Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisableInteractionRelevanceAdvisorySwitchType(DisableInteractionRelevanceAdvisorySwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Object Class Relevance Advisory Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Object Class Relevance Advisory Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisableObjectClassRelevanceAdvisorySwitchType(DisableObjectClassRelevanceAdvisorySwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Time Constrained Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Time Constrained Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisableTimeConstrainedType(DisableTimeConstrainedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Time Regulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Time Regulation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisableTimeRegulationType(DisableTimeRegulationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disconnect Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disconnect Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisconnectType(DisconnectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discover Object Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discover Object Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscoverObjectInstanceType(DiscoverObjectInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Asynchronous Delivery Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Asynchronous Delivery Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnableAsynchronousDeliveryType(EnableAsynchronousDeliveryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Attribute Relevance Advisory Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Attribute Relevance Advisory Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnableAttributeRelevanceAdvisorySwitchType(EnableAttributeRelevanceAdvisorySwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Attribute Scope Advisory Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Attribute Scope Advisory Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnableAttributeScopeAdvisorySwitchType(EnableAttributeScopeAdvisorySwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Callbacks Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Callbacks Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnableCallbacksType(EnableCallbacksType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Interaction Relevance Advisory Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Interaction Relevance Advisory Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnableInteractionRelevanceAdvisorySwitchType(EnableInteractionRelevanceAdvisorySwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Object Class Relevance Advisory Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Object Class Relevance Advisory Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnableObjectClassRelevanceAdvisorySwitchType(EnableObjectClassRelevanceAdvisorySwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Time Constrained Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Time Constrained Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnableTimeConstrainedType(EnableTimeConstrainedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Time Regulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Time Regulation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnableTimeRegulationType(EnableTimeRegulationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endian Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endian Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndianType(EndianType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedDataType(EnumeratedDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Data Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Data Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedDataType1(EnumeratedDataType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Data Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Data Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedDataTypesType(EnumeratedDataTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratorType(EnumeratorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evoke Callback Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evoke Callback Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvokeCallbackType(EvokeCallbackType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evoke Multiple Callbacks Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evoke Multiple Callbacks Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvokeMultipleCallbacksType(EvokeMultipleCallbacksType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federate Restore Complete Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federate Restore Complete Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFederateRestoreCompleteType(FederateRestoreCompleteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federate Save Begun Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federate Save Begun Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFederateSaveBegunType(FederateSaveBegunType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federate Save Complete Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federate Save Complete Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFederateSaveCompleteType(FederateSaveCompleteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federation Restore Begun Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federation Restore Begun Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFederationRestoreBegunType(FederationRestoreBegunType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federation Restored Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federation Restored Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFederationRestoredType(FederationRestoredType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federation Restore Status Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federation Restore Status Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFederationRestoreStatusResponseType(FederationRestoreStatusResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federation Saved Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federation Saved Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFederationSavedType(FederationSavedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federation Save Status Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federation Save Status Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFederationSaveStatusResponseType(FederationSaveStatusResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federation Synchronized Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federation Synchronized Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFederationSynchronizedType(FederationSynchronizedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldType(FieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Record Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Record Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedRecordDataType(FixedRecordDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Record Data Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Record Data Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedRecordDataType1(FixedRecordDataType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Record Data Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Record Data Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedRecordDataTypesType(FixedRecordDataTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Record Encoding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Record Encoding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedRecordEncodingType(FixedRecordEncodingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flush Queue Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flush Queue Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlushQueueRequestType(FlushQueueRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Attribute Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Attribute Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAttributeHandleType(GetAttributeHandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Attribute Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Attribute Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAttributeNameType(GetAttributeNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Automatic Resign Directive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Automatic Resign Directive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAutomaticResignDirectiveType(GetAutomaticResignDirectiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Available Dimensions For Class Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Available Dimensions For Class Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAvailableDimensionsForClassAttributeType(GetAvailableDimensionsForClassAttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Available Dimensions For Interaction Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Available Dimensions For Interaction Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAvailableDimensionsForInteractionClassType(GetAvailableDimensionsForInteractionClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Dimension Handle Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Dimension Handle Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetDimensionHandleSetType(GetDimensionHandleSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Dimension Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Dimension Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetDimensionHandleType(GetDimensionHandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Dimension Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Dimension Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetDimensionNameType(GetDimensionNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Dimension Upper Bound Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Dimension Upper Bound Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetDimensionUpperBoundType(GetDimensionUpperBoundType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Federate Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Federate Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetFederateHandleType(GetFederateHandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Federate Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Federate Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetFederateNameType(GetFederateNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Interaction Class Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Interaction Class Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetInteractionClassHandleType(GetInteractionClassHandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Interaction Class Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Interaction Class Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetInteractionClassNameType(GetInteractionClassNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Known Object Class Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Known Object Class Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetKnownObjectClassHandleType(GetKnownObjectClassHandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Object Class Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Object Class Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetObjectClassHandleType(GetObjectClassHandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Object Class Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Object Class Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetObjectClassNameType(GetObjectClassNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abort Federation Restore Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abort Federation Restore Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbortFederationRestoreType(AbortFederationRestoreType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abort Federation Save Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abort Federation Save Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbortFederationSaveType(AbortFederationSaveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternativeType(AlternativeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Announce Synchronization Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Announce Synchronization Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnounceSynchronizationPointType(AnnounceSynchronizationPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Domain Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Domain Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationDomainType(ApplicationDomainType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayDataType(ArrayDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Data Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Data Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayDataType1(ArrayDataType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Datatype Encoding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Datatype Encoding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayDatatypeEncodingType(ArrayDatatypeEncodingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Data Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Data Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayDataTypesType(ArrayDataTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Data Types Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Data Types Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayDataTypesType1(ArrayDataTypesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Associate Regions For Updates Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Associate Regions For Updates Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociateRegionsForUpdatesType(AssociateRegionsForUpdatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Ownership Acquisition If Available Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Ownership Acquisition If Available Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeOwnershipAcquisitionIfAvailableType(AttributeOwnershipAcquisitionIfAvailableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Ownership Acquisition Notification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Ownership Acquisition Notification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeOwnershipAcquisitionNotificationType(AttributeOwnershipAcquisitionNotificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Ownership Acquisition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Ownership Acquisition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeOwnershipAcquisitionType(AttributeOwnershipAcquisitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Ownership Divestiture If Wanted Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Ownership Divestiture If Wanted Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeOwnershipDivestitureIfWantedType(AttributeOwnershipDivestitureIfWantedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Ownership Release Denied Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Ownership Release Denied Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeOwnershipReleaseDeniedType(AttributeOwnershipReleaseDeniedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Ownership Unavailable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Ownership Unavailable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeOwnershipUnavailableType(AttributeOwnershipUnavailableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributes In Scope Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributes In Scope Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributesInScopeType(AttributesInScopeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributes Out Of Scope Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributes Out Of Scope Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributesOutOfScopeType(AttributesOutOfScopeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeType(AttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeType1(AttributeType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Data Representations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Data Representations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicDataRepresentationsType(BasicDataRepresentationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicDataType(BasicDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Data Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Data Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicDataType1(BasicDataType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cancel Attribute Ownership Acquisition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cancel Attribute Ownership Acquisition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCancelAttributeOwnershipAcquisitionType(CancelAttributeOwnershipAcquisitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cancel Negotiated Attribute Ownership Divestiture Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cancel Negotiated Attribute Ownership Divestiture Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCancelNegotiatedAttributeOwnershipDivestitureType(CancelNegotiatedAttributeOwnershipDivestitureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityType(CapabilityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalityType(CardinalityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Attribute Order Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Attribute Order Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeAttributeOrderTypeType(ChangeAttributeOrderTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Interaction Order Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Interaction Order Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeInteractionOrderTypeType(ChangeInteractionOrderTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commit Region Modifications Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commit Region Modifications Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommitRegionModificationsType(CommitRegionModificationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confirm Attribute Ownership Acquisition Cancellation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confirm Attribute Ownership Acquisition Cancellation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfirmAttributeOwnershipAcquisitionCancellationType(ConfirmAttributeOwnershipAcquisitionCancellationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confirm Attribute Transportation Type Change Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confirm Attribute Transportation Type Change Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfirmAttributeTransportationTypeChangeType(ConfirmAttributeTransportationTypeChangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OmtSwitch
