package pet.store.controller.model;

import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;
import pet.store.entity.Customer;
import pet.store.entity.PetStore;

@Data
@NoArgsConstructor
public class PetStoreCustomer {
	private Long customerId;
	private String customerFirstName;
	private String customerLastName;
	private String customerEmail;
	private static CustomerPetStore petStore;

	public PetStoreCustomer(Customer customer) {
		customerId = customer.getCustomerId();
		customerFirstName = customer.getCustomerFirstName();
		customerLastName = customer.getCustomerLastName();
		customerEmail = customer.getCustomerEmail();
	}

	@Data
	@NoArgsConstructor
	public static class CustomerPetStore {
		private Long petStoreId;
		private String petStoreName;
		private String petStoreAddress;
		private String petStoreCity;
		private String petStoreState;
		private String petStoreZip;
		private String petStorePhone;

		public CustomerPetStore(Set<PetStore> petStores) {
			petStoreId = petStore.getPetStoreId();
			petStoreName = petStore.getPetStoreName();
			petStoreAddress = petStore.getPetStoreAddress();
			petStoreCity = petStore.getPetStoreCity();
			petStoreState = petStore.getPetStoreState();
			petStoreZip = petStore.getPetStoreZip();
			petStorePhone = petStore.getPetStorePhone();
		}
	}
}